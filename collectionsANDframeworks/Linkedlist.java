package collectionsANDframeworks;
// ✅ Java LinkedList Summary

// 🔹 LinkedList is a linear data structure consisting of nodes.
// 🔹 Each node contains data and references to the next (and previous) node — making it a doubly linked list by default in Java.
// 🔹 It is part of java.util and implements List, Deque, and Queue interfaces.
// 🔹 Efficient for insertions/deletions (O(1) at head/tail) but slower for random access (O(n)).
// 🔹 Can use removeIf(predicate) — removes all elements satisfying the given condition.
// Having initial capacity of 16 and load factor of 0.75
import java.util.*;

public class Linkedlist {
    public static void main(String[] args) {
        List<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        
        // Removes elements greater than 15
        // ll.removeIf(n -> n > 15);
        System.out.println(ll); // Output: [10]
    }
}
