import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.*;

public class FileHandler {
    private String  locationFile;
    private String fileInputName;
    private String fileOutputName;
    private FileWriter writer;
    private MyStackChar stack = new MyStackChar();

    FileHandler(String location, String fileInputN, String fileOutputN) {
        this.fileInputName = fileInputN;
        this.fileOutputName = fileOutputN;
        this.locationFile = location;

    }

    public MyStackChar readFile() {
        String fullPath = Paths.get(locationFile, fileInputName).toString();
        try (BufferedReader br = new BufferedReader(new FileReader(fullPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (char c : line.toCharArray()) {
                    stack.push(c);
                }
                stack.push('\n');
            }
            stack.pop();  //Elimina el ultimo salto de linea agregado
        } catch (IOException e) {
            System.err.printf("Error leyendo el archivo: %s%n", e.getMessage());
        }

        if (stack.empty()) {
            System.out.println("Stack vacio.");
            return null;
        } else {
            return stack;
        }
    }

    public void openFileWriter () throws IOException {
        //validar si exste el archivo
        if (Files.exists(Paths.get(locationFile, fileOutputName))) {
            System.out.println("El archivo ya existe, se eliminara.");
            Files.delete(Paths.get(locationFile, fileOutputName));
        }
        writer = new FileWriter(Paths.get(locationFile, fileOutputName).toString(), true);
       
    }
    public void writeFile(char c) throws IOException {
        if ( writer != null) writer.write(c);
        if (writer == null) System.out.println("Escritor no inicializado.");
    }

    public void closeFileWriter() throws IOException {
        if ( writer != null) writer.close();
        if (writer == null) System.out.println("Archivo cerrado.");
    }
    
    
}
