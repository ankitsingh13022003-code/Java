// Example of Encapsulation in Java

class Student {

    // 1. Private data members (data hiding)
    private String name;
    private int age;

    // 2. Public getter method (to read private data)
    public String getName() {
        return name;
    }

    // 3. Public setter method (to update private data)
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {              // validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}
// Main Class – Testing Encapsulation
public class EncapsulationDemo {

    public static void main(String[] args) {

        Student s = new Student();

        // Setting values using setter methods
        s.setName("Ankit");
        s.setAge(21);

        // Accessing values using getter methods
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
