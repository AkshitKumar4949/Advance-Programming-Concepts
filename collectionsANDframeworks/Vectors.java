// ✅ Java Vector Summary

// 🔹 Vector is a legacy class in Java that implements List and is synchronized (thread-safe).
// 🔹 It grows dynamically. You can define its initial capacity and capacity increment.
// 🔹 When capacity is exceeded, it grows by the defined increment.
// 🔹 Methods like add(), size(), capacity() are used for operations and tracking.

package collectionsANDframeworks;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,5);
        vector.add(69);
        vector.add(46);
        vector.add(49);
        System.out.println(vector.size());
        System.out.println(vector.capacity());
        vector.add(49);
        System.out.println(vector.size());
        System.out.println(vector.capacity());
        System.out.println(vector);
    }
}
