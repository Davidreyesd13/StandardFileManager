package standardfilemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
    
    private Workbook workbook;
    public void Arbol_Ordenado(int IndiceNodoActual, ArrayList<Long> lista, Arbol_Binario arbol) {
        if (IndiceNodoActual >= 0) {
            Node node = arbol.getNodos().get(IndiceNodoActual);
            for (int i = 0; i < node.getN(); i++) {
                Arbol_Ordenado(node.getHijos().get(i), lista, arbol);
                lista.add(node.getLlaves().get(i).getPos());
            } // Fin For
            Arbol_Ordenado(node.getHijos().get(node.getN()), lista, arbol);
        } // Fin If
    } // Fin BTree Keys In Order

    public String Fill_Excel(Archivo archivo, File archivo_excel, ArrayList<Long> lista) throws IOException {
        String respuesta = "No se realizo con exito la exportación.";
        if (archivo_excel.getName().endsWith("xlsx")) {
            workbook = new HSSFWorkbook();
        } else {//ver video
            workbook = new XSSFWorkbook();
        } // Fin If
        String nombre_txt = archivo.getArchivo().getName();
        Sheet hoja = workbook.createSheet(nombre_txt.substring(0, nombre_txt.length() - 4));
        for (int i = -1; i < lista.size(); i++) {
            Row fila = hoja.createRow(i + 1);
            if (i == -1) {
                //AGREGA EL NOMBRE DE LOS CAMPOS
                for (int j = 0; j < archivo.getCampos().size(); j++) {
                    //SE CREA UNA NUEVA CELDA EN LA POSICION J DE LA FILA I
                    Cell celda = fila.createCell(j);
                    //SE LE AGREGA LA INFORMACION A LA CELDA
                    celda.setCellValue(archivo.getCampos().get(j).getNombre());
                } // Fin For
            } else {
                //AGREGA LOS REGISTROS AL EXCEL
                long RRN = lista.get(i);
                String line = Read_Registro(Math.toIntExact(RRN), archivo);
                //LE HAGO UN .SPLIT A LOS REGISTROS
                String arreglo[] = line.split("\\|");
                //EL FOR DE J ES PARA PODER RECORRER LA CANTIDAD DE COLUMNAS
                for (int j = 0; j < archivo.getCampos().size(); j++) {
                    //SE CREA UNA NUEVA CELDA EN LA POSICION J DE LA FILA I
                    Cell celda = fila.createCell(j);
                    String insertar = arreglo[j];
                    celda.setCellValue(insertar);
                } // Fin For
            } // Fin If
            workbook.write(new FileOutputStream(archivo_excel));
            respuesta = "¡Exportación Completada!";
        } // Fin If
        return respuesta;
    } // Fin Llenar Excel

    private String Read_Registro(int RRN, Archivo archivo_actual) {
        String linea = "";
        // Esto lo que hace es asegurarse de leer el archivo correcto
        File archivo = new File(archivo_actual.getArchivo().getAbsolutePath());
        try {
            RandomAccessFile af = new RandomAccessFile(archivo, "rw");
            af.seek(RRN);
            for (int i = 0; i < archivo_actual.LongitudFijaCampos(); i++) {
                linea += af.readChar();
            } // Fin For
        } catch (IOException e) {
        } // Fin Try
        return linea;
    } // Fin Leer Registro
}
