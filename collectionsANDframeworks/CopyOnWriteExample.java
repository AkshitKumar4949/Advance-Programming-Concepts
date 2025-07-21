
// ✅ CopyOnWriteArrayList Summary

// 🔹 Thread-safe version of ArrayList from java.util.concurrent
// 🔹 Ideal for read-heavy, write-light scenarios
// 🔹 Creates a fresh copy of the list on every write (add/remove/set)
// 🔹 Iterators are fail-safe and don't throw ConcurrentModificationException

// 🔹 Use cases: Event listeners, configuration caches, concurrent reads

// 🔹 Performance:
//    - Read: Fast and safe
//    - Write: Costly due to full copy
//    - Memory: Higher overhead (copying array on writes)

package collectionsANDframeworks;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;
public class CopyOnWriteExample {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        for (String lang : list) {
            System.out.println("Reading: " + lang);
            if (lang.equals("Python")) {
                // list.remove("Python");
                list.add("Go");
            }
        }

        System.out.println("Final List: " + list);
    }
}
