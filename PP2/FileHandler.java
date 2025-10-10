import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
    private String  locationFile;
    private String fileInputName;
    private String fileOutputName;
    private MyStackChar stack = new MyStackChar();

    FileHandler(String location, String fileInputN, String fileOutputN) {
        this.fileInputName = fileInputN;
        this.fileOutputName = fileOutputN;
        this.locationFile = location;

    }



    public ArrayList<Character> readFile () {

        try (BufferedReader br = new BufferedReader( new FileReader(this.locationFile +this.fileInputName))) {
            String linea;
            while ((linea = br.readLine())!= null){
                char[] charArray = linea.toCharArray();
                for (char c : charArray) {
                    stack.push(c);
                }

            }

            
            
        } catch (IOException e) {
            System.out.print("Error "+ e );
        }

        if(stack.empyt()){
            System.out.print("Stack vacio");
            
           return null;
        } else {
            System.out.print("Stack con carnita");
            return stack.getStack();
        }
        
    }
    
}
