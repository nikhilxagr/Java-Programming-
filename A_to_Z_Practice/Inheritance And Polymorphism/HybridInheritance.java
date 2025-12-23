interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog eats");
    }

    public void play() {
        System.out.println("Dog plays");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
