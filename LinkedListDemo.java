import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding Elements
        list.add("A");                // add at end
        list.add("B");
        list.add("C");

        list.addFirst("Start");       // add at beginning
        list.addLast("End");          // add at end

        list.add(2, "Inserted");      // add at specific index

        System.out.println("After Adding Elements: " + list);

        // Accessing Elements
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Updating Elements
        list.set(3, "Updated");
        System.out.println("After Updating: " + list);

        // Removing Elements
        list.remove();                // removes first
        list.remove(2);               // removes by index
        list.remove("C");             // removes by value
        list.removeFirst();           // removes first element
        list.removeLast();            // removes last element

        System.out.println("After Removing Elements: " + list);

        // Checking Elements
        list.add("X");
        list.add("Y");
        list.add("Z");

        System.out.println("Contains X? " + list.contains("X"));
        System.out.println("Is List Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());

        // Peek & Poll Methods (Queue operations)
        System.out.println("Peek First: " + list.peek());
        System.out.println("Peek Last: " + list.peekLast());

        System.out.println("Poll First: " + list.poll());        // removes first
        System.out.println("Poll Last: " + list.pollLast());     // removes last

        System.out.println("List After Peek & Poll: " + list);

        // Stack-like operations
        list.push("Pushed");   // add at start
        list.push("Top");

        System.out.println("After Push: " + list);

        System.out.println("Popped Element: " + list.pop());    // remove first

        System.out.println("Final List: " + list);

        // Clearing the List
        list.clear();
        System.out.println("After Clear: " + list);
    }
}
