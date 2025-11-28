import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        // HashMap (No order, fastest)
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(101, "Ankit");
        hashMap.put(102, "Rahul");
        hashMap.put(103, "Neha");
        hashMap.put(null, "NullKey");
        hashMap.put(104, "Ankit"); // duplicate value allowed

        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap (Maintains insertion order)
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(1, "Apple");
        linkedMap.put(2, "Banana");
        linkedMap.put(3, "Grapes");

        System.out.println("LinkedHashMap: " + linkedMap);

        // TreeMap (Sorted order)
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(50, "Zara");
        treeMap.put(10, "Mike");
        treeMap.put(30, "John");
        treeMap.put(20, "Tina");

        System.out.println("TreeMap (Sorted Keys): " + treeMap);

        // Hashtable (Thread-safe, no nulls)
        Map<Integer, String> hashTable = new Hashtable<>();
        hashTable.put(11, "Java");
        hashTable.put(22, "Python");
        hashTable.put(33, "C++");

        System.out.println("Hashtable: " + hashTable);


        // Accessing Values
        System.out.println("Value for key 101 in HashMap: " + hashMap.get(101));

        // Looping through Map
        System.out.println("\nLooping through HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // KeySet & Values
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
    }
}
