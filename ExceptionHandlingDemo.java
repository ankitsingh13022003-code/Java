import java.io.*;

public class ExceptionHandlingDemo {

    // Method with throws
    static void readFile() throws IOException {
        FileReader fr = new FileReader("data.txt");
    }

    public static void main(String[] args) {

        // try-catch
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        // multiple catch
        try {
            int arr[] = {1,2,3};
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index invalid");
        }

        // throw example
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // throws example
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File issue");
        }

        // finally block
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Null pointer exception");
        } finally {
            System.out.println("finally always runs");
        }
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18+");
        }
    }
}
