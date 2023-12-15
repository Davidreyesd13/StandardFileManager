
package standardfilemanager;

import java.io.FileWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Notepad {
    private ArrayList<String> lineas = new ArrayList();
    private File file = null;

    public ArrayList<String> getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList<String> lineas) {
        this.lineas = lineas;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
    public Notepad(String path) {
        file = new File(path);
    }

    public void cargarArchivo() {
        try {
            Scanner s = new Scanner(new File("ArchivoTexto.txt"));
            ArrayList<String> lineas = new ArrayList<String>();
            while (s.hasNextLine()) {
                lineas.add(s.nextLine());
            }
            s.close();
        } catch (Exception ex) {

        }
    }

    public void escribirArchivo() {
        try{ 
            FileWriter writer = new FileWriter("ArchivoTexto.txt");
            for (String str : lineas) {
                writer.write(str + System.lineSeparator());
            }
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
