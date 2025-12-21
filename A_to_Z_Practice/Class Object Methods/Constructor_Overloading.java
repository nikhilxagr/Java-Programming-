class Employee {

    String name;
    int id;
    double salary;

    // Constructor with 2 parameters
    Employee(String n, int i) {
        name = n;
        id = i;
    }

    // Constructor with 3 parameters
    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ravi", 101);
        Employee e2 = new Employee("Sita", 102, 45000);

        e1.display();
        System.out.println("-----");
        e2.display();
    }
}
