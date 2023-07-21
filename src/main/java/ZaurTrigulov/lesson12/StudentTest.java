package ZaurTrigulov.lesson12;

import ZaurTrigulov.lesson11.Student;
import  static  ZaurTrigulov.lesson11.Student.*;

public class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student("Коля", 3, 4.55);
        Student st2 = new Student("Коля", 4, 4.55);
        Student st3 = new Student("Маша", 5, 4.55);


        student_If_EqualsCourse(st1,st2);
        student_If_EqualsCourse(st2, st3);
        student_If_EqualsGrade(st1, st3);
        studentNestedIf(st1,st2);


    }

}



