package collectionsANDframeworks;
import java.util.*;
// LinkedHashMap uses doubly linkedlist to store values and hence it is little slower than haashmap but it preserves insertion order unlike hashmap. Having default capacity of 16 and load factor 0.75
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Apple",1);
        linkedHashMap.put("Banana",2);
        linkedHashMap.put("Guava",3);
        for(Map.Entry<String,Integer> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
