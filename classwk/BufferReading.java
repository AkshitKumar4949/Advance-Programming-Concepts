package classwk;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReading {
    public static void main(String[] args) throws IOException{
        // FileReader fr = new FileReader("C:\\Users\\hi\\OneDrive\\Desktop\\APC\\classwk\\g5.txt");
        BufferedReader br = new BufferedReader((new FileReader("C:\\Users\\hi\\OneDrive\\Desktop\\APC\\classwk\\g5.txt")));
        String line = br.readLine();
        while(line!=null){
            System.out.print(line);
            System.out.println();
            line = br.readLine();
        }
        br.close();
    }
}
