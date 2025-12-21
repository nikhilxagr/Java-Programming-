
class Student {
    String name;
    int age;

    // Method to display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class MethodExample {

    public static void main(String[] args) {

        Student s1;
        s1 = new Student();

        // Assign values using object reference
        s1.name = "Rahul";
        s1.age = 20;

        // Method call using object reference
        s1.displayInfo();
    }
}
