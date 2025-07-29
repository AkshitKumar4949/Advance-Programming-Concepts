package classwk.Threading;

class Demo{
    public void printDemo(){
        for(int i=1;i<=10;i++)
        System.out.println("Anything"+i);
    }
}
class MyThread extends Thread {
    Demo d1;
    MyThread(Demo d1){
        this.d1 = d1;
    }
    @Override
    public void run(){
        d1.printDemo();
    }
}
public class ThreadSync {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Thread t1 = new MyThread(demo);
        Thread t2 = new MyThread(demo);
        t1.start();
        t2.start();
    }
}