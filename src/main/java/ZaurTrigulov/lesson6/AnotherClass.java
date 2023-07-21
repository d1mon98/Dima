package ZaurTrigulov.lesson6;

public class AnotherClass {

    public static void main(String[] args) {
        ZaurTrigulov.lesson6.Employee emp1 = new Employee(10, "Конюхов", 40, "Логистика");
        System.out.println(emp1.surname + " " + emp1.age+ " " + emp1.department);

        emp1.getSalary();
        emp1.getId();
        emp1.getSurname();
    }
}
