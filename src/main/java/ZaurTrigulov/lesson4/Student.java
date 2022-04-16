package ZaurTrigulov.lesson4;

public class Student {

    int biletNo; //номер студенческого билета
    String firstName; // имя стуредная
    String secondName; // фамилия студента
    int eduYear; // год обучения
    double gpaMath; // средний балл по математики
    double gpaEconomics; // средний балл по экномомике
    double gpaEngish; //средний бал по английскому языку
    double gpaTotal;


}

class StudentRunner {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.biletNo = 1;
        student1.firstName = "Дмитрий";
        student1.secondName = "Иешкин";
        student1.eduYear = 2004;
        student1.gpaEconomics = 4.5;
        student1.gpaMath = 4.6;
        student1.gpaEngish = 4.8;
        student1.gpaTotal = ((student1.gpaMath+student1.gpaEconomics+student1.gpaEngish)/3);
       double gpa1 = ((double)(((int)(student1.gpaTotal*100)))/100);


        Student student2 = new Student();
        student2.biletNo = 13;
        student2.firstName = "Елена";
        student2.secondName = "Тыкина";
        student2.eduYear = 2003;
        student2.gpaEconomics = 4.69;
        student2.gpaMath = 4.9;
        student2.gpaEngish = 3.8;
        student2.gpaTotal = ((student2.gpaMath+student2.gpaEconomics+student2.gpaEngish)/3);
        double gpa2 = ((double)(((int)(student2.gpaTotal*100)))/100);


        Student student3 = new Student();
        student3.biletNo = 43;
        student3.firstName = "Вася";
        student3.secondName = "Пупкин";
        student3.eduYear = 2001;
        student3.gpaEconomics = 3.8;
        student3.gpaMath = 3.9;
        student3.gpaEngish = 5;
        student3.gpaTotal = ((student3.gpaMath+student3.gpaEconomics+student3.gpaEngish)/3);
        double gpa3 = ((double)(((int)(student3.gpaTotal*100)))/100);


        System.out.println("---------------------------------------");
        System.out.println(student1.firstName + " " + student1.secondName);
        System.out.println("Номер билета: " + student1.biletNo);
        System.out.println("Год обучения: " + student1.eduYear);
        System.out.println("Средний балл по всем предметам: " + gpa1);
        System.out.println("---------------------------------------");
        System.out.println(student2.firstName + " " + student2.secondName);
        System.out.println("Номер билета: " + student2.biletNo);
        System.out.println("Год обучения: " + student2.eduYear);
        System.out.println("Средний балл по всем предметам: " + gpa2);
        System.out.println("---------------------------------------");
        System.out.println(student3.firstName + " " + student3.secondName);
        System.out.println("Номер билета: " + student3.biletNo);
        System.out.println("Год обучения: " + student3.eduYear);
        System.out.println("Средний балл по всем предметам: " + gpa3);



    }
}
