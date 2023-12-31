
package standardfilemanager;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Admin_arbolsecundario {// implements Serializable {

   // private static final long SerialVersionUID = 777777L;
    private ArrayList<Archivoarbolsecundario> lista_arboles_secundarios = new ArrayList();
    private File archivo = null;
    Random random = new Random();
    private Arbol_Binario arbol;

    public Admin_arbolsecundario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Archivoarbolsecundario> getListaArboles() {
        return lista_arboles_secundarios;
    }

    public void setArbol(int orden) {
        this.arbol = new Arbol_Binario(orden);
    }

    public Arbol_Binario getArbol() {
        return arbol;
    }

    public void setListaArboles(ArrayList<Archivoarbolsecundario> lista_arboles_secundarios) {
        this.lista_arboles_secundarios = lista_arboles_secundarios;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void cargarArchivo() {
        try {
            lista_arboles_secundarios = new ArrayList();
            Archivoarbolsecundario arch;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((arch = (Archivoarbolsecundario) objeto.readObject()) != null) {
                        lista_arboles_secundarios.add(arch);
                    } // Fin While
                } catch (EOFException ex) {
                } // Fin Try Catch
                objeto.close();
                entrada.close();
            } // Fin If
        } catch (Exception ex) {
        } // Fin Try Catch
    } // Fin Cargar Archivo

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Archivoarbolsecundario a : lista_arboles_secundarios) {
                bw.writeObject(a);
            } // Fin For
            bw.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            } // Fin Try Catch
        } // Fin Try Catch
    } // Fin Escribir Archivo

}
