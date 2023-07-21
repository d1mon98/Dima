package ZaurTrigulov.lesson4;

public class Employee {

    int id;
    public String surname;
    int age;
    double salary;
    String department;

    Employee(int id2) {
        id = id2;
    }

    public Employee(String surname3) {
        surname = surname3;
    }

   private Employee(double salary4) {
        salary = salary4;
    }


    /*
        double salaryRise(double riseKoefficient) {
            salary = salary * riseKoefficient;
            System.out.println("-------------------------------------\nКоэффициент повышения зарплаты: " + riseKoefficient);
            System.out.println("Зарплата после повышения: " + salary + "\n--------------------------------------");
            return salary;
        }

        void info() {
            System.out.println("Id number: " + id + "\nФамлиия: " + surname + "\nВозраст: " + age + "\nЗарплата: " +
                    salary + "\nПодразделение: " + department + "\n--------------------------------------");
        }
    }
     */
    public void getID() {
        System.out.println("Id: " + id);
    }

    public void getSurname() {
        System.out.println("Фамилия: " + surname);
    }

    public void getSalary() {
        System.out.println("Зарплата: " + salary + "\n-----------------");
    }
}

class EmployeeRunner {
    public static void main(String[] args) {
        Employee em1 = new Employee(33);
        Employee em2 = new Employee("Тыкина");
       // Employee em3 = new Employee(49000.0);

        em1.getID();
        em1.getSurname();
        em1.getSalary();

        em2.getID();
        em2.getSurname();
        em2.getSalary();

      //  em3.getID();
      //  em3.getSalary();®
      //  em3.getSurname();
    }
}
