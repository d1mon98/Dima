package ZaurTrigulov.Homework.lesson11;

public class Student {
    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    String name;
    int course;
    double grade;


}

class StudentTest {


    // Метод с 1 if statment
    public static void compareStudents(Student s1, Student s2) {

        if (s1.name.equals(s2.name) && s1.course == s2.course && s1.grade == s2.grade) {
            System.out.println("У студентов все параметры равны");
        } else {
            System.out.println("У студентов есть различающиеся параметры");
        }
    }

    // Method with Nested-If statment

    public static void compareStudents2(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("имена, курсы, оценки - одинаковые");
                } else {
                    System.out.println("имена, курсы - одинаковые; оценки - разные");
                }
            } else {
                System.out.println("имена одинаковые, курсы - разные, оценки - хз");
            }
        } else {
            System.out.println("имена - разные, оценки, курсы - хз");
        }
    }


    public static void main(String[] args) {

        Student s1 = new Student("Ivan", 3, 5);
        Student s2 = new Student("Ivan", 3, 5);

        // compareStudents(s1, s2);
        compareStudents2(s1, s2);
    }


}

