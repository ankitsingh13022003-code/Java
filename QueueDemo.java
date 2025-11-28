import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue (FIFO)
        System.out.println("=== Queue (FIFO) using LinkedList ===");

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);   // add element
        queue.offer(20);
        queue.offer(30);

        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek()); // returns head
        System.out.println("Poll (remove): " + queue.poll()); // removes head
        System.out.println("Queue after poll: " + queue);

        // PriorityQueue (Min-Heap by default)
        System.out.println("\n=== PriorityQueue (Min-Heap) ===");

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println("PriorityQueue: " + pq);
        System.out.println("Peek (smallest): " + pq.peek());
        System.out.println("Poll (remove smallest): " + pq.poll());
        System.out.println("After poll: " + pq);
        // Deque (Double-ended queue)
        System.out.println("\n=== Deque (Double Ended Queue) ===");

        Deque<String> deque = new ArrayDeque<>();

        deque.offerFirst("A");  // add at head
        deque.offerLast("B");   // add at tail
        deque.offerLast("C");

        System.out.println("Deque: " + deque);
        System.out.println("Peek First: " + deque.peekFirst());
        System.out.println("Peek Last: " + deque.peekLast());

        System.out.println("Poll First: " + deque.pollFirst()); // removes A
        System.out.println("Poll Last: " + deque.pollLast());   // removes C
        System.out.println("Deque after operations: " + deque);

        // ArrayDeque (Recommended over LinkedList)
        System.out.println("\n=== ArrayDeque (Fast Deque Implementation) ===");

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offerFirst(0);

        System.out.println("ArrayDeque: " + ad);
        System.out.println("Poll First: " + ad.pollFirst());
        System.out.println("Poll Last: " + ad.pollLast());
        System.out.println("ArrayDeque after operations: " + ad);
    }
}
