import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        // Creating Vector
        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        System.out.println("Initial Vector: " + vector);

        // addElement() – Legacy method
        vector.addElement(60);

        // 4. Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Removing elements
        vector.remove(2);         // remove by index
        vector.removeElement(40); // remove by value (legacy)
        System.out.println("After Removals: " + vector);

        // Checking size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Searching elements
        System.out.println("Contains 20? " + vector.contains(20));
        System.out.println("Index of 50: " + vector.indexOf(50));

        // Inserting at specific index
        vector.add(1, 99);
        System.out.println("After Insert at Index: " + vector);

        // First & last element
        System.out.println("First: " + vector.firstElement());
        System.out.println("Last: " + vector.lastElement());

        // Iterating Vector
        System.out.println("\nIterating Vector:");
        for (int val : vector) {
            System.out.print(val + " ");
        }

        System.out.println();
    }
}
