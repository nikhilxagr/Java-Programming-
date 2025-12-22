class Student {
    String name;

    void show() {
        System.out.println(name);
    }
}

public class newOperator {
    public static void main(String[] args) {
        Student s1 = new Student(); // new operator
        s1.name = "Rahul";
        s1.show();
    }
}
