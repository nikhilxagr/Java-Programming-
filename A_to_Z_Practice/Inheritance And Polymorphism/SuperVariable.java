class Animal {
    String color = "White";
}

class Dog extends Animal {
    String color = "Black";

    void printColor() {
        System.out.println(color); // Black (child)
        System.out.println(super.color); // White (parent)
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
