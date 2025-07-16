package classwk;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.add(10);
        ll.add(52);
        ll.add(69);ll.add(46);
        ll.add(70);
        // System.out.println(ll);
        // System.out.println(ll.size());
        // ll.sort(null);
        // System.out.println(ll);
        // for(int num:ll){
        //     System.out.print(num+"<->");
        // }
        Iterator<Integer> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+"<->");
        }
    }
}
