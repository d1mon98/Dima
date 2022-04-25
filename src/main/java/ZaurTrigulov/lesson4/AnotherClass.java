package ZaurTrigulov.lesson4;

public class AnotherClass {
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
    }
}
