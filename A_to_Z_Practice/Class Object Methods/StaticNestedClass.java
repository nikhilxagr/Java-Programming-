class Outer {
    static int x = 10;

    // Static Nested Class
    static class Nested {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}

public class StaticNestedClass {
    public static void main(String[] args) {
        Outer.Nested obj = new Outer.Nested();
        obj.display();
    }
}
