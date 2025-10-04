package classwk;
import java.util.*;

public class Optionals {
    static int[] roll = { 1, 2, 3, 4, 5, 6, 7 };
    static String[] name = { "Neeraj", "Ram", "Shyam", "Ghanshyam" };

    static Optional<String> getname(int id) {
        if (id < 1 || id > name.length) {
            return Optional.empty();
        }
        return Optional.of(name[id - 1]);
    }
    static Optional<String> getEmail(String str){
        if(str.equals("Akshit")){
            return Optional.of("akshitkumar4949@gmail.com");
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        // getEmail("Aksht").ifPresent(name->System.out.println(name));

        Optional<String> email = getEmail("Aksit");
        if(email.isPresent()){
            System.out.println(email.get());
        }
        else{
            System.out.println("user not found");
        }
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter ID: ");
        // int id = sc.nextInt();
        // sc.close();
        // Optional<String> nm = getname(id);
        
        // if (nm.isPresent()) {
        //     System.out.println("Name: " + nm.get());
        // } else {
        //     System.out.println("Name is not there.");
        // }

        // getname(id).ifPresent((name)->System.out.println(name));
        // getname(id).ifPresentOrElse(
        //     (name)->System.out.println(name), 
        //     ()->System.out.print("Not a name"));
        
        // String x = getname(id).orElseThrow(()-> new ArrayIndexOutOfBoundsException());
        // System.out.println("name is "+x);
    }
}
