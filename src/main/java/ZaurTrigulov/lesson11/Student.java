package ZaurTrigulov.lesson11;

public class Student {

    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void student_If_EqualsCourse(Student s1, Student s2) {
        if (s1.course == s2.course) {
            System.out.println("Студенты " + s1.name + " и " + s2.name + " учатся на одинковом курсе - на " + s1.course);
        } else {
            System.out.println(s1.name + " учится на " + s1.course + ", а " + s2.name + " на " + s2.course +
                    " курсе");
        }
    }

    public static void student_If_EqualsGrade(Student s1, Student s2) {
        if (s1.grade == s2.grade) {
            System.out.println("У " + s1.name + " и " + s2.name + " одинаковый средний балл = " + s1.grade);
        } else {
            System.out.println("У " + s1.name + " средний балл = " + s1.grade + ", а у " + s2.name + " " + s2.grade);
        }
    }

    public static void studentNestedIf(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            if (s1.course == s2.course) {
                if (s1.grade == s2.grade) {
                    System.out.println("Имена студентов " + s1.name + ", курсы - " + s1.course + " и оценки " + s1.grade +
                            " - одинаковые.");
                } else {
                    System.out.println("Имена студентов - " + s1.name + " и курс - " + s1.course + " - одинаковые, но оценки "
                            + s1.grade + " и " + s2.grade + " различаются.");

                }
            } else {
                System.out.println("Имена студентов - " + s1.name + " одинаковые , но курсы - " + s1.course + " и "
                        + s2.course + " - различаются.");
            }
        } else {
            System.out.println("Имена студентов " + s1.name + " и " + s2.name +" - различаются.");
        }
    }
}






