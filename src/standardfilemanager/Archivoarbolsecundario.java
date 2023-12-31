
package standardfilemanager;

import java.io.File;
import java.io.Serializable;


public class Archivoarbolsecundario implements Serializable {

    private static final long SerialVersionUID = 777777L;

    private File archivo;
    private int IDArchivoActual;
    private Arbol_Binario arbolSecundario;

    public Archivoarbolsecundario() {

    } // Fin Constructor Archivo Arbol Secundario

    public Archivoarbolsecundario(File archivo, int IDArchivoActual, Arbol_Binario arbolSecundario) {
        this.archivo = archivo;
        this.IDArchivoActual = IDArchivoActual;
        this.arbolSecundario = arbolSecundario;
    } // Fin Constructor Archivo Arbol Secundario

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public int getIDArchivoActual() {
        return IDArchivoActual;
    } // Fin Get ID Archivo Actual

    public void setIDArchivoActual(int IDArchivoActual) {
        this.IDArchivoActual = IDArchivoActual;
    } // Fin Set ID Archivo Actual

    public Arbol_Binario getArbolSecundario() {
        return arbolSecundario;
    } // Fin Get Arbol Secundario

    public void setArbolSecundario(Arbol_Binario arbolSecundario) {
        this.arbolSecundario = arbolSecundario;
    } // Fin Set Arbol Secundario
}
