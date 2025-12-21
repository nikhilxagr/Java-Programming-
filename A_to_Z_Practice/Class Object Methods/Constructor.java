class Student {

    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Amit", 21);
        s1.display();
    }
}
