// Parent class (Super class)
class Animal {
    void eat() {
        System.out.println("This animal eats food");
    }
}

// Child class (Sub class)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks");
    }
}

// Main class
public class inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited method
        d.bark();  // child class method
    }
}
