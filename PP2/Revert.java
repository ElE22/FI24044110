public class Revert {

    public static void main(String[] args) {
      FileHandler fHandler = new FileHandler("./","input.txt", "output.txt");
      MyStackChar stack = fHandler.readFile();
      if ( stack != null) {
        try {
          fHandler.openFileWriter();
          while (!stack.empty()) {
            char c = stack.pop();
            fHandler.writeFile(c);
           
          }
          fHandler.closeFileWriter();
          System.out.println("Archivo revertido correctamente.");
        } catch (Exception e) {
          System.err.printf("Error procesando el archivo: %s%n", e.getMessage());
        }
      }


      
      
    }
}
