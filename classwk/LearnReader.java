package classwk;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LearnReader {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\hi\\OneDrive\\Desktop\\APC\\classwk\\g5.txt");
        // f.createNewFile();

        FileReader fr = new FileReader("classwk/g5.txt");
        int i = fr.read();
        // System.out.println((char)(i));

        char[] arr = new char[(int) f.length()];
        fr.read(arr);
        for (char ch : arr) {
            System.out.print(ch);
        }

        // while (i != -1) {
        // System.out.print((char) i);
        // i = fr.read();
        // }
        // fr.close();
        // read function read every thing as character and returns integer. It returns
        // -1 when there's nothing in the
        // FileReader fr = new FileReader(f);
    }
}
