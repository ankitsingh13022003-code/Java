import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        // Creating a Stack of Integer type
        Stack<Integer> stack = new Stack<>();

        // 1. push() – Add elements to stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Stack after push operations: " + stack);

        // 2. peek() – View top element (does NOT remove)
        System.out.println("Top element (peek): " + stack.peek());

        // 3. pop() – Remove top element
        int removed = stack.pop();
        System.out.println("Popped element: " + removed);
        System.out.println("Stack after pop: " + stack);

        // 4. search() – Find 1-based position from top
        int position = stack.search(20); 
        // If element 20 is at top → returns 1
        // If second from top → returns 2, and so on
        System.out.println("Position of 20 from top: " + position);

        // 5. empty() – Check if stack is empty
        System.out.println("Is stack empty? " + stack.empty());

        // 6. isEmpty() – Same as empty() 
        System.out.println("Using isEmpty(): " + stack.isEmpty());

        // 7. size() – Number of elements
        System.out.println("Stack size: " + stack.size());
        // 8. Iterating through Stack
        System.out.println("Iterating stack elements:");
        for (Integer val : stack) {
            System.out.println(val);
        }
    }
}
