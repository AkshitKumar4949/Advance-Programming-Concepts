package exceptionhandling;

public class Prac1 {
    public static void main(String[] args) {
        System.out.println(divide(4,0));
    }
    public static int divide(int a,int b){
        try{
            return a/b;
        }
        catch(Exception exc){
            System.out.println(exc);
            return -1;
        }
    }
}