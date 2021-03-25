package praktika;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import praktika.Contact;
import praktika.Order;
import praktika.Students;
import praktika.Head;

public class WFile {
    public static void main(String[]args){
    
    try {
    File file = new File("Tfile.txt");
    if(!file.exists())
        file.createNewFile();
    PrintWriter pw = new PrintWriter(file);
    pw.println();
    pw.close();
    } catch(IOException e){
        System.out.print("Error: " + e);
    }
  }
}
