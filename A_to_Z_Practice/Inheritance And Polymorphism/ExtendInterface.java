interface Printer {
    void print();
}

interface Scanner extends Printer {
    void scan();
}

class Machine implements Scanner {

    public void print() {
        System.out.println("Printing Document");
    }

    public void scan() {
        System.out.println("Scanning Document");
    }
}

public class ExtendInterface {
    public static void main(String[] args) {
        Machine m = new Machine();
        m.print();
        m.scan();
    }
}
