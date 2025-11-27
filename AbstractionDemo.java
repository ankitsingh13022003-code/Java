// Abstract class
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Normal method
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class
class Dog extends Animal {

    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        // We cannot create an object of abstract class
        // Animal a = new Animal(); ❌

        Animal dog = new Dog();   // Upcasting

        dog.sound();              // calling abstract method implementation
        dog.sleep();              // calling normal method
    }
}
