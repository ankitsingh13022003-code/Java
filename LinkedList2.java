import java.util.LinkedList;
public class LinkedList2 {
    

public class MergeSortLinkedList {

    public static void main(String[] args) {
                // //create linked list
        // LinkedList<Integer> ll=new LinkedList<>();
        // //add data
        // ll.addFirst(0);
        // ll.addLast(1);
        // ll.addLast(2);
        // System.out.println(ll);
        // //remove
        // ll.removeFirst();
        // ll.removeLast();
        // System.out.println(ll);
        
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(12);
        linkedList.add(11);
        linkedList.add(13);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(7);

        System.out.println("Linked list before sorting: " + linkedList);

        mergeSort(linkedList);

        System.out.println("Linked list after sorting: " + linkedList);
    }

    private static void mergeSort(LinkedList<Integer> linkedList) {
        int size = linkedList.size();
        if (size < 2) {
            return; // Already sorted if the size is 0 or 1
        }

        int mid = size / 2;
        LinkedList<Integer> leftList = new LinkedList<>();
        LinkedList<Integer> rightList = new LinkedList<>();

        // Split the linked list into two halves
        for (int i = 0; i < mid; i++) {
            leftList.add(linkedList.removeFirst());
        }

        while (!linkedList.isEmpty()) {
            rightList.add(linkedList.removeFirst());
        }

        // Recursively sort the two halves
        mergeSort(leftList);
        mergeSort(rightList);

        // Merge the sorted halves
        merge(linkedList, leftList, rightList);
    }

    private static void merge(LinkedList<Integer> mergedList, LinkedList<Integer> left, LinkedList<Integer> right) {
        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.getFirst() <= right.getFirst()) {
                mergedList.add(left.removeFirst());
            } else {
                mergedList.add(right.removeFirst());
            }
        }

        // Add remaining elements from left and right lists (if any)
        while (!left.isEmpty()) {
            mergedList.add(left.removeFirst());
        }

        while (!right.isEmpty()) {
            mergedList.add(right.removeFirst());
        }
    }
}

    
    
    
}
