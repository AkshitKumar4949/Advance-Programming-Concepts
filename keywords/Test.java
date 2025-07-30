package keywords;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Volatile obj = new Volatile();
        Thread t1 = new Thread(obj,"thread1");
        t1.start();
        Thread.sleep(1000);
        obj.startWork();
        System.out.println(obj.getWorkStatus());
    }
}
