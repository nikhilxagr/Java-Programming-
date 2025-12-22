class Student {
    String name;

    Student(String name) {
        this.name = name; // this refers to current object
    }

    void show() {
        System.out.println(name);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Student s1 = new Student("Amit");
        s1.show();
    }
}
