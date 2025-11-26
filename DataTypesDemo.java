public class DataTypesDemo {

    public static void main(String[] args) {

        //Primitive Data Types
        // byte (1 byte) → Range: -128 to 127
        byte myByte = 100;

        // short (2 bytes)
        short myShort = 30000;

        // int (4 bytes) → Most commonly used integer type
        int myInt = 500000;

        // long (8 bytes) → Use 'L' at the end
        long myLong = 15000000000L;

        // float (4 bytes) → Use 'f' at the end
        float myFloat = 5.75f;

        // double (8 bytes) → Default decimal type
        double myDouble = 19.99;

        // char (2 bytes) → Single character
        char myChar = 'A';

        // boolean (1 bit) → true or false
        boolean myBool = true;

        //Non-Primitive Data Types

        // String → Sequence of characters (Class type)
        String myString = "Hello Java";

        // Array → Collection of similar data types
        int[] numbers = {1, 2, 3, 4, 5};

        // Class Objects → Example using DataTypesDemo class
        DataTypesDemo obj = new DataTypesDemo();

        //Printing Values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("boolean: " + myBool);
        System.out.println("String: " + myString);

        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nObject created: " + obj);
    }
}
