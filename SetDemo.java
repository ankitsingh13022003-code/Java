import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        // HashSet (No order, Fast)
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(20); // duplicate ignored

        System.out.println("HashSet: " + hashSet); 
        // Output example: [20, 10, 30] (order not guaranteed)

        // LinkedHashSet (Maintains insertion order)
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Java");
        linkedHashSet.add("Python");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java"); // ignored

        System.out.println("LinkedHashSet: " + linkedHashSet);
        // Output: [Java, Python, C++]

        // TreeSet (Sorted Set)
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);

        System.out.println("TreeSet (Sorted): " + treeSet);
        // Output: [10, 20, 30, 50]
        // Set common methods
        System.out.println("Contains 20? " + hashSet.contains(20));
        System.out.println("Size of HashSet: " + hashSet.size());

        hashSet.remove(10);
        System.out.println("After removing 10: " + hashSet);

        hashSet.clear();
        System.out.println("After clear: " + hashSet);

        // Looping through a Set
        for(String lang : linkedHashSet){
            System.out.println("Language: " + lang);
        }
    }
}
