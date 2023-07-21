package ZaurTrigulov.Homework;

public class Student {

    int studentID, yearOfStudy;
    double avgMath, avgEconomics, avgForeignLanguage;
    String firstName, lastName;


    Student() {
    }

    Student(int studentID, int yearOfStudy, String firstName, String lastName) {
        this.studentID = studentID;
        this.yearOfStudy = yearOfStudy;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(int studentID, int yearOfStudy, double avgMath, double avgEconomics, double avgForeignLanguage,
            String firstName, String lastName) {
        this.studentID = studentID;
        this.yearOfStudy = yearOfStudy;
        this.avgMath = avgMath;
        this.avgEconomics = avgEconomics;
        this.avgForeignLanguage = avgForeignLanguage;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

class StudentTest {

    double gpaCalc(Student st) {
        double GPA = (st.avgMath + st.avgEconomics + st.avgForeignLanguage) / 3;
        System.out.println("Средняя арифметическая оценка студента " + st.firstName + " "
                + st.lastName + ": " + GPA);
        return GPA;
    }

    // метод для вычисления среднего арифметического
    public static void main(String[] args) {


        Student st1 = new Student();
        st1.studentID = 1;
        st1.firstName = "Иван";
        st1.lastName = "Иванов";
        st1.yearOfStudy = 1;
        st1.avgMath = 4.3;
        st1.avgEconomics = 4.5;
        st1.avgForeignLanguage = 4.7;

        Student st2 = new Student();
        st2.studentID = 2;
        st2.firstName = "Петр";
        st2.lastName = "Петров";
        st2.yearOfStudy = 2;
        st2.avgMath = 5.0;
        st2.avgEconomics = 5.0;
        st2.avgForeignLanguage = 4.9;

        Student st3 = new Student();
        st3.studentID = 3;
        st3.firstName = "Светлана";
        st3.lastName = "Кукушкина";
        st3.yearOfStudy = 3;
        st3.avgMath = 3.7;
        st3.avgEconomics = 4.5;
        st3.avgForeignLanguage = 5.0;


        Student st4 = new Student();
        Student st5 = new Student(5,2,"Антон","Куликов");
        Student st6 = new Student(6,3,5,5,5,"Дмитрий","Иешкин");

        System.out.println(st4.studentID);
        System.out.println(st5.firstName + " " +st5.lastName);

        StudentTest St = new StudentTest();
        St.gpaCalc(st6);

    }


}