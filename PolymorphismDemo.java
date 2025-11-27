// Compile-Time Polymorphism (Method Overloading)
class Calculator {

    // Same method name, different number of parameters
    int add(int a, int b) {
        return a + b;
    }

    // Different data type
    double add(double a, double b) {
        return a + b;
    }

    // Different number of arguments
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Run-Time Polymorphism (Method Overriding)
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moos");
    }
}
// Main Class
public class PolymorphismDemo {

    public static void main(String[] args) {
        // Demonstrating Method Overloading
        Calculator calc = new Calculator();

        System.out.println("Method Overloading Examples:");
        System.out.println("add(int, int) = " + calc.add(10, 20));
        System.out.println("add(double, double) = " + calc.add(5.5, 2.3));
        System.out.println("add(int, int, int) = " + calc.add(1, 2, 3));

        System.out.println("--------------------------------------");

        // Demonstrating Method Overriding
        System.out.println("Method Overriding Examples:");

        Animal a1 = new Dog();  // dynamic binding
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();  // Dog's version
        a2.sound();  // Cat's version
        a3.sound();  // Cow's version
    }
}
