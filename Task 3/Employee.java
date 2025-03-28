import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Ram Singh", 50000));
        employees.add(new Employee(2, "Nitu Roy", 60000));
        employees.add(new Employee(3, "Prem Kumar", 55000));

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}