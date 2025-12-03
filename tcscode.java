import java.util.Scanner;

public class tcscode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of test cases:");
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println("Enter binary string for test case " + (i + 1) + ":");
            String binaryString = scanner.next();

            System.out.println("Enter A and B for test case " + (i + 1) + " separated by space:");
            int costA = scanner.nextInt();
            int costB = scanner.nextInt();

            int result = calculateMinimizedCost(binaryString, costA, costB);
            if (result == -1) {
                System.out.println("INVALID");
            } else {
                System.out.println(result);
            }
        }

        scanner.close();
    }

    private static int calculateMinimizedCost(String binaryString, int costA, int costB) {
        if (!isValidBinaryString(binaryString)) {
            return -1; // INVALID
        }

        int count01 = 0;
        int count10 = 0;

        // Count occurrences of "01" and "10" in the binary string
        for (int i = 0; i < binaryString.length() - 1; i++) {
            if (binaryString.charAt(i) == '0' && binaryString.charAt(i + 1) == '1') {
                count01++;
            } else if (binaryString.charAt(i) == '1' && binaryString.charAt(i + 1) == '0') {
                count10++;
            }
        }

        // Calculate cost for the original order
        int originalCost = count01 * costA + count10 * costB;

        // Calculate cost for the reversed order
        int reversedCost = count01 * costB + count10 * costA;

        // Choose the minimum cost between the original and reversed order
        return Math.min(originalCost, reversedCost);
    }

    private static boolean isValidBinaryString(String binaryString) {
        // Check if the string contains only 0s and 1s
        for (char c : binaryString.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}
