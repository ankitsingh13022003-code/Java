public class ArrayDemo {

    public static void main(String[] args) {

        // 1. 1D Array (Single Dimensional Array)

        // Method 1: Declare + Initialize
        int[] numbers = {10, 20, 30, 40, 50};

        // Method 2: Declare first, initialize later
        int[] marks = new int[5];
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 75;
        marks[3] = 95;
        marks[4] = 80;

        System.out.println("1D Array Values:");
        for (int num : numbers) {       // Enhanced for loop
            System.out.print(num + " ");
        }

        System.out.println("\nMarks Array:");
        for (int i = 0; i < marks.length; i++) {  // Normal for loop
            System.out.print(marks[i] + " ");
        }

        System.out.println("\n-------------------------------------");


        // 🔹 2. 2D Array (Matrix)

        // Method 1: Declare + Initialize (Matrix form)
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Method 2: Declare first, assign values later
        int[][] grid = new int[2][3];   // 2 rows, 3 columns
        grid[0][0] = 10;
        grid[0][1] = 20;
        grid[0][2] = 30;
        grid[1][0] = 40;
        grid[1][1] = 50;
        grid[1][2] = 60;

        System.out.println("2D Array (Matrix) Values:");
        for (int i = 0; i < matrix.length; i++) {         // Loop through rows
            for (int j = 0; j < matrix[i].length; j++) {  // Loop through columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        System.out.println("-------------------------------------");


        // 3. Printing 2D Array Using Enhanced For Loop
        System.out.println("2D Array Using For-Each Loop:");
        for (int[] row : grid) {      // loop through row arrays
            for (int value : row) {   // loop through each value
                System.out.print(value + " ");
            }
            System.out.println();
        }

        // 4. Accessing Specific Elements
        System.out.println("-------------------------------------");
        System.out.println("Specific Element Access:");
        System.out.println("matrix[1][2] = " + matrix[1][2]);  // row 1, col 2  (value: 6)
        System.out.println("grid[0][1] = " + grid[0][1]);      // row 0, col 1  (value: 20)

    }
}
