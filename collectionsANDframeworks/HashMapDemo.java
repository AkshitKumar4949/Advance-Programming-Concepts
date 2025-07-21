package collectionsANDframeworks;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Akshit");
        map.put(2,"Neha");
        map.put(3,"Vipul");

        for(int i:map.keySet()){
            System.out.println(i+" -> "+map.get(i));
        }
    }
}
