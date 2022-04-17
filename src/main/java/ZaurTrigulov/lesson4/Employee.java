package ZaurTrigulov.lesson4;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;

     double salaryRise (double riseKoefficient){
        salary = salary*riseKoefficient;
         System.out.println("-------------------------------------\nКоэффициент повышения зарплаты: " + riseKoefficient);
         System.out.println("Зарплата после повышения: " + salary+ "\n--------------------------------------");
        return salary;
    }

    void info(){
        System.out.println("Id number: " + id + "\nФамлиия: " + surname + "\nВозраст: " +age +"\nЗарплата: " +
                salary+"\n--------------------------------------");
    }
}

class EmployeeRunner{
    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.id = 33;
        em1.surname = "Петров";
        em1.age = 40;
        em1.salary = 45000;
        em1.info();
        em1.salaryRise(2);
        em1.info();

        Employee em2 = new Employee();
        em2.id =363;
        em2.surname="Тыкина";
        em2.age =36;
        em2.salary = 39500;
        em2.info();
        em2.salaryRise(4);
        em2.info();


    }
}
