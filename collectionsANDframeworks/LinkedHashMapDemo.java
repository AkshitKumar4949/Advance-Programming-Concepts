package collectionsANDframeworks;

import java.util.*;

// LinkedHashMap uses a doubly linked list to maintain insertion order.
// It is slightly slower than HashMap due to this additional ordering overhead.
// Default initial capacity = 16, load factor = 0.75.
// Access order is false by default, meaning elements maintain insertion order.
// If accessOrder is set to true, it behaves like an LRU (Least Recently Used) cache.
// In accessOrder mode, recently accessed items move to the end.
// Just like HashMap it isn't thread safe. 
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Guava", 3);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
