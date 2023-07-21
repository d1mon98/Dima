package ZaurTrigulov.Homework;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    //constructor
    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    //method
    double salaryDouble() {
        salary *= 2;
        return salary;
    }


}

class EmployeeTest {

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Ivanov", 38, 7500, "Bureau of Legislative Affairs");
        Employee emp2 = new Employee(2, "Awabdeh", 39, 8500, "Bureau of Cyberspace and Digital Policy");

        System.out.println(emp1.surname + " salary, $: " + emp1.salary);
        System.out.println(emp2.surname + " salary, $: " + emp2.salary);

        System.out.println();
        System.out.println("Произошло удвоение зарплаты!");

        emp1.salaryDouble();
        emp2.salaryDouble();

        System.out.println(emp1.surname + " salary, $: " + emp1.salary);
        System.out.println(emp2.surname + " salary, $: " + emp2.salary);

    }
}
