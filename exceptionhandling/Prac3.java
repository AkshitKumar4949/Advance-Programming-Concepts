package exceptionhandling;

public class Prac3 {
    public static void main(String[] args) {
        String nam = null;
        try{
            System.out.println(name(nam));
        }
        catch(NullPointerException npe){
            System.out.println(npe.getMessage());
        }
    }

    public static String name(String n) {
        try {
            return n.toLowerCase();
        } catch (NullPointerException npe) {
            System.out.println("Null pointer exception occurred in name() method!");
            throw new NullPointerException("Name cannot be null");
        }
    }
}
