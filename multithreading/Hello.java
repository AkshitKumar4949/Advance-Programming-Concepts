public class Hello extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            System.out.print("Hello");
            System.out.println(Thread.currentThread().getName());
        }
    }
}