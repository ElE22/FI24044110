import java.util.ArrayList;

public class Revert {

    public static void main(String[] args) {
      System.out.println("Hello World!");
      FileHandler var1 = new FileHandler("./","input.txt", "output.txt");
      ArrayList<Character> charListInvert = var1.readFile();
      
    }
}
