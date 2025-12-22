
class Student {
    String name;
    int age;

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class MethodExample {

    public static void main(String[] args) {

        Student s1;
        s1 = new Student();

       
        s1.name = "Rahul";
        s1.age = 20;

      
        s1.displayInfo();
    }
}
