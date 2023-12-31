package standardfilemanager;

import java.io.Serializable;

public class Campos implements Serializable {

    private static final long SerialVersionUID = 109L;
    private int ID;
    private String nombre;
    private String tipo_de_dato;
    private int longitud;
    private boolean llave_primaria;
    private boolean llave_secundaria;
    private int IDarchivo;

    public Campos() {
    } // Fin Constructor Campo

    public Campos(int ID, int ID_archivo, String nombre, String tipo_de_dato, int longitud, boolean llave_primaria, boolean llave_secundaria) {
        this.ID = ID;
        this.IDarchivo = ID_archivo;
        this.nombre = nombre;
        this.tipo_de_dato = tipo_de_dato;
        this.longitud = longitud;
        this.llave_primaria = llave_primaria;
        this.llave_secundaria = llave_secundaria;
    }// Fin Constructor Campo

    public int getID() {
        return ID;
    } // Fin Get ID

    public void setID(int ID) {
        this.ID = ID;
    } // Fin Set ID

    public boolean isLlave_primaria() {
        return llave_primaria;
    }

    public void setLlave_primaria(boolean llave_primaria) {
        this.llave_primaria = llave_primaria;
    }

    public int getIDarchivo() {
        return IDarchivo;
    }

    public void setIDarchivo(int IDarchivo) {
        this.IDarchivo = IDarchivo;
    }

    public String getNombre() {
        return nombre;
    } // Fin Get Nombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // Fin Set Nombre

    public String getTipo_de_dato() {
        return tipo_de_dato;
    } // Fin Get Tipo de Dato

    public void setTipo_de_dato(String tipo_de_dato) {
        this.tipo_de_dato = tipo_de_dato;
    } // Fin Set Tipo de Dato

    public int getLongitud() {
        return longitud;
    } // Fin Get Longitud

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    } // Fin Set Longitud

    public boolean isLlavePrimaria() {
        return llave_primaria;
    } // Fin Is Llave Primaria

    public void setLlaveprimaria(boolean llave_primaria) {
        this.llave_primaria = llave_primaria;
    } // Fin Set Llave Primaria

    public boolean isLlave_secundaria() {
        return llave_secundaria;
    } // Fin Is Llave Secundaria

    public void setLlave_secundaria(boolean llave_secundaria) {
        this.llave_secundaria = llave_secundaria;
    } // Fin Set Llave Secundaria

    public String Cross_Campos() {
        return nombre + tipo_de_dato + longitud;
    }

    @Override
    public String toString() {
        String llave_primaria = "Si";
        if (!isLlavePrimaria()) {
            llave_primaria = "No";
        }// Fin If
        String llave_secundaria = "Si";
        if (!isLlave_secundaria()) {
            llave_secundaria = "No";
        }// Fin If
        return "Nombre: " + nombre + "\nTipo de Dato: " + tipo_de_dato + "\nLongitud: " + longitud + "\n¿Llave Primaria?: " + llave_primaria + "\n¿Llave Secundaria?: " + llave_secundaria + '\n' + '\n';
    } // Fin ToString

    public String campo_para_archivo() {
        String llave_primaria = "Si";
        if (!isLlavePrimaria()) {
            llave_primaria = "No";
        }// Fin If
        String llave_secundaria = "Si";
        if (!isLlave_secundaria()) {
            llave_secundaria = "No";
        }// Fin If
        return nombre + "¡" + tipo_de_dato + "¡" + longitud + "¡" + llave_primaria + "¡" + llave_secundaria + "&";
    } // Fin Campo Para Archivo

} // Fin Clase Campo
