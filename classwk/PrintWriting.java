package classwk;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriting {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("C:\\Users\\hi\\OneDrive\\Desktop\\APC\\classwk\\g5.txt");
        pw.write(100);
        pw.println(69);
        pw.println(true);
        pw.flush();
        pw.close();
    }
}
