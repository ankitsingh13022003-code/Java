public class ForLoopDemo {

    public static void main(String[] args) {

        // 1. Basic for loop
        System.out.println("1. Basic For Loop:");
        for (int i = 1; i <= 5; i++) {   // i starts from 1 and goes to 5
            System.out.println("i = " + i);
        }

        // 2. For loop with step size
        System.out.println("\n2. For Loop with Step Size:");
        for (int i = 0; i <= 10; i += 2) {  // increment by 2
            System.out.println("i = " + i);
        }

        // 3. Reverse for loop
        System.out.println("\n3. Reverse For Loop:");
        for (int i = 5; i >= 1; i--) {  // countdown from 5 to 1
            System.out.println("i = " + i);
        }

        // 4. Enhanced For-Each Loop (Arrays)
        System.out.println("\n4. Enhanced For-Each Loop:");
        int[] numbers = {10, 20, 30, 40, 50};

        for (int num : numbers) {   // iterates through each array element
            System.out.println("num = " + num);
        }

        // 5. Nested For Loop
        System.out.println("\n5. Nested For Loop (Printing a 3x3 Grid):");
        for (int i = 1; i <= 3; i++) {         // outer loop for rows
            for (int j = 1; j <= 3; j++) {     // inner loop for columns
                System.out.print(j + " ");
            }
            System.out.println();  // new line after each row
        }

        // 6. For Loop with Conditional Check
        System.out.println("\n6. For Loop with Condition (Even Numbers):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {      // check even
                System.out.println("Even: " + i);
            }
        }

        // 7. Infinite For Loop (Commented for safety)
        /* 
        for(;;) {
            System.out.println("This is an infinite loop");
        }
        */
    }
}
