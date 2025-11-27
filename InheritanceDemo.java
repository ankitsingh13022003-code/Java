// ALL TYPES OF INHERITANCE IN A SINGLE IMPLEMENTATION

// SINGLE INHERITANCE
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {  // Single Inheritance
    void bark() {
        System.out.println("Dog barks");
    }
}



// MULTILEVEL INHERITANCE
class BabyDog extends Dog {  // Dog → BabyDog
    void weep() {
        System.out.println("BabyDog weeps");
    }
}



// HIERARCHICAL INHERITANCE
class Cat extends Animal {  // Animal → Cat
    void meow() {
        System.out.println("Cat meows");
    }
}



// HYBRID INHERITANCE (Using Interface, since Java does NOT support multiple inheritance directly)
interface WaterAnimal {
    void swim();
}

class Fish extends Animal implements WaterAnimal {  
    public void swim() {
        System.out.println("Fish swims");
    }
}

// MAIN CLASS TO EXECUTE ALL TYPES
public class InheritanceDemo {

    public static void main(String[] args) {

        // 1️⃣ SINGLE INHERITANCE
        System.out.println("---- Single Inheritance ----");
        Dog d = new Dog();
        d.eat();   // from Animal
        d.bark();  // from Dog

        // 2️⃣ MULTILEVEL INHERITANCE
        System.out.println("\n---- Multilevel Inheritance ----");
        BabyDog bd = new BabyDog();
        bd.eat();   // from Animal
        bd.bark();  // from Dog
        bd.weep();  // from BabyDog

        // 3️⃣ HIERARCHICAL INHERITANCE
        System.out.println("\n---- Hierarchical Inheritance ----");
        Cat c = new Cat();
        c.eat();   // from Animal
        c.meow();  // from Cat

        // 4️⃣ HYBRID INHERITANCE (using interface)
        System.out.println("\n---- Hybrid Inheritance (via Interface) ----");
        Fish f = new Fish();
        f.eat();   // from Animal
        f.swim();  // from WaterAnimal interface
    }
}
