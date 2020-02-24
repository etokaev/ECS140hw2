import java.io.IOException;
import java.io.FileInputStream;

public class TerminalApp
{
  
  //private Chario chario;
  //private Scanner scanner;
  //private Parser parser;
  //private String version;

  public TerminalApp(final String[] array){
    if (array.length == 0)
      System.out.println("error: no nada package");
  
  FileInputStream fileInputStream;

  try {
    fileInputStream = new FileInputStream(array[0]);
      }
      catch (IOException ex) {
        System.out.println("Error opening file.");
        return;
          }   

  }

  public static void main(final String[] array){
    new TerminalApp(array);
  }
}

