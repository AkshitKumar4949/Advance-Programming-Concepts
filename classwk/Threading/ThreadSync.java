package classwk.Threading;

class MyThread extends Thread {
    @Override
    public void run(){

    }
}
public class ThreadSync {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
    }
}