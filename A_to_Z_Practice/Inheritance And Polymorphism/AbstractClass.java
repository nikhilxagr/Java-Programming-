abstract class Animal {

    // abstract method (no body)
    abstract void sound();

    // non-abstract method
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

    // implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

        Animal a = new Dog(); // reference of abstract class
        a.sound();
        a.eat();
    }
}
