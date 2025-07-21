package collectionsANDframeworks;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(69);
        list.add(72);
        list.add(1);
        list.add(100);
        System.out.println(list.get(2));
        // Retrieves the element at the specified index.

        System.out.println(list.get(4));
        
        list.remove(Integer.valueOf(100));
        // Removes the first occurrence of the specified value.
        // Use Integer.valueOf(x) to remove a specific number.

        list.sort(null);
        // Purpose: Sorts the list in natural (ascending) order.
        // Passing null tells Java to use the default comparator (i.e., ascending order
        // for numbers).

        System.out.println(list);
    }
}
