class Outer {
    int x = 20;

    // Inner Class
    class Inner {
        void show() {
            System.out.println("Value of x: " + x);
        }
    }
}

public class InnerClassExp{
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show();
    }
}
