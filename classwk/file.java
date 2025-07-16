package classwk;
import java.io.File;
import java.util.*;
import java.io.IOException;
public class file {
    public static void main(String[] args) throws IOException {
        File obj = new File("C:\\Users\\hi\\OneDrive\\Desktop\\APC");
        obj.createNewFile();
        System.out.println(obj.exists());
        System.out.println(obj.length());
        File obj2 = new File("Folder1");
        obj2.mkdir();
        System.out.println(obj2.exists());
        String arr[] = obj.list();
        System.out.println(Arrays.toString(arr));
        File arr1[] = obj.listFiles();
        System.out.println(Arrays.toString(arr1));

        String name = obj.getName();
        System.out.println(name);
    }
}