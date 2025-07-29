public class Main{
    public static void main(String[] args) {
        Hello obj = new Hello(); // NEW STATE
        obj.start(); //Now thread is in runnable state.
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName());
            // Thread is in running state
        }
        // Terminated. 
    }
}