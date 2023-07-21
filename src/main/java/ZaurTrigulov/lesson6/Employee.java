package ZaurTrigulov.lesson6;

public class Employee {

    public Employee(int id, String surname, int age, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.department = department;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    Employee(int id, String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    //methods

    public void getId() {
        System.out.println("ID: " + id);
    }

    public void getSalary() {
        System.out.println("Salary: " + salary);
    }

    public void getSurname() {
        System.out.println("Surname: " + surname);
    }


    public static void main(String[] args) {


        Employee emp2 = new Employee(5000);
        emp2.surname = "Воробьев";

        emp2.getSurname();
        emp2.getSalary();
    }
}

class EmployeeTest {
    public static void main(String[] args) {

        Employee emp1 = new Employee(4, "Иешкин", 22);


        emp1.getSurname();
        emp1.getSalary();


    }
}


