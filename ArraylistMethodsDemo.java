import java.util.ArrayList;
import java.util.Collections;

public class ArraylistMethodsDemo {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // add() – Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Initial List: " + list);

        // add(index, element) – Insert at position
        list.add(1, "Grapes");
        System.out.println("After adding at index 1: " + list);

        // get() – Access element

        System.out.println("Element at index 2: " + list.get(2));

        // set() – Update/Change value
        list.set(2, "Kiwi");
        System.out.println("After updating index 2: " + list);

        // remove() – Remove element
        list.remove("Banana");  // remove element by value
        list.remove(0);         // remove element by index
        System.out.println("After removing elements: " + list);

        // size() – Total elements
        System.out.println("List Size: " + list.size());

        // contains() – Check if element exists
        System.out.println("Contains 'Orange'? : " + list.contains("Orange"));

        //  indexOf() – First index of element
        System.out.println("Index of 'Orange': " + list.indexOf("Orange"));

        // isEmpty() – Check empty list
        System.out.println("Is list empty? : " + list.isEmpty());

        // For-each loop (iterate)
        System.out.println("Iterating List:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // sort() – Sort list alphabetically
        Collections.sort(list); //need to import java.util.Collection
        System.out.println("Sorted List: " + list);

        // clear() – Remove all elements
        list.clear();
        System.out.println("After clear(): " + list);

        // ensureCapacity() (Optional)
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.ensureCapacity(20); // set internal capacity

        System.out.println("Capacity ensured for numbers list.");
    }
}
