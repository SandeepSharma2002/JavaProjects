import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * FileOperation
 */
public class FileOperation {

    public static void main(String[] args) throws IOException {
        FileWriter f1 = new FileWriter("xyz.txt", true);
        PrintWriter pw = new PrintWriter(f1);
        
        FileReader f2 = new FileReader("abc.txt");
        BufferedReader br = new BufferedReader(f2);
        String line = br.readLine();
        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }
        
        pw.flush();
        pw.close();
        br.close();

        
    }
}