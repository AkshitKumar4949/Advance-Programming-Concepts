package classwk;

import java.io.IOException;
import java.io.FileWriter;

public class LearnWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\hi\\OneDrive\\Desktop\\APC\\classwk\\g5.txt");
        fw.write(100);
        fw.write('\n');
        fw.write("d");
        char[] arr = { '1', '2', '3', '4', '5' };
        fw.write('\n');
        fw.write(arr);
        fw.flush();
        fw.close();
    }
}
