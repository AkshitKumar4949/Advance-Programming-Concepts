package classwk;

import java.util.*;

public class ArrayListvsVectors {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> lst = new ArrayList<>();
        List<Integer> vec = new Vector<>();
        Runnable addToArray = () -> {
            for (int i = 0; i < 2000; i++) {
                lst.add(i + 1);
            }
        };
        Runnable addToVector = () -> {
            for (int i = 0; i < 2000; i++) {
                vec.add(i + 1);
            }
        };
        Thread t1 = new Thread(addToArray);
        Thread t2 = new Thread(addToArray);
        Thread t3 = new Thread(addToArray);

        Thread t4 = new Thread(addToVector);
        Thread t5 = new Thread(addToVector);
        Thread t6 = new Thread(addToVector);

        t1.start();
        t2.start();
        t3.start();

        t4.start();
        t5.start();
        t6.start();

        t1.join();
        t2.join();
        t3.join();
        // t4.join();
        // t5.join();
        // t6.join();

        System.out.println("Size of arraylist : "+lst.size());
        System.out.println("Size of vector : "+vec.size());
    }
}
