import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {
        try {

            // Create a File
            File file = new File("example.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists!");
            }

            // Write to File using FileWriter
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is file handling in Java.\n");
            writer.write("Writing to a file using FileWriter.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Read File using FileReader
            FileReader reader = new FileReader("example.txt");
            int character;

            System.out.println("\nReading file using FileReader:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();

            // Read File using BufferedReader
            System.out.println("\n\nReading file using BufferedReader:");

            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // Append to File
            FileWriter writerAppend = new FileWriter("example.txt", true); // true = append mode
            writerAppend.write("\nThis line is added later using append mode.");
            writerAppend.close();
            System.out.println("\nData appended successfully!");

            // Delete File
            File deleteFile = new File("example.txt");

            if (deleteFile.delete()) {
                System.out.println("\nDeleted the file: " + deleteFile.getName());
            } else {
                System.out.println("\nFailed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
