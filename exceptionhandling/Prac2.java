package exceptionhandling;
public class Prac2 {
    public static void main(String[] args) {
        Prac2 obj = new Prac2();
        int arr[] = {1,2,3,4};
        obj.printArray(arr);
    }
    public void printArray(int[] arr){
        for(int i=0;i<5;i++){
            try{
                System.out.println(arr[i]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }
    }
}
