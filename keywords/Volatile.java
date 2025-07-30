package keywords;
public class Volatile extends Thread{
    private volatile boolean work = false;
    public void startWork() {
        work = true;
        System.out.println("Work started by " + Thread.currentThread().getName());
    }
    public boolean getWorkStatus(){
        return work;
    }
    public void run(){
        while(!getWorkStatus()){
            // Waiting for work to start
        }
        System.out.println("Work detected by: "+Thread.currentThread().getName());
    }
}
