package ZaurTrigulov.lesson4;

public class Student {

    int biletNo; //номер студенческого билета
    String firstName; // имя студента
    String secondName; // фамилия студента
    int eduYear; // год обучения
    double gpaMath; // средний балл по математики
    double gpaEconomics; // средний балл по экномомике
    double gpaEngish; //средний бал по английскому языку
    double gpaTotal; // средний балл по всем предметам

    Student(int biletNo1, String firstName1, String secondName1, int eduYear1, double gpaMath1, double gpaEconomics1, double gpaEngish1) {

        biletNo = biletNo1;
        firstName = firstName1;
        secondName = secondName1;
        eduYear= eduYear1;
        gpaMath = gpaMath1;
        gpaEconomics = gpaEconomics1;
        gpaEngish = gpaEngish1;
    }

    Student(int biletNo2, String firstName2, String secondName2, int eduYear2) {
        this(biletNo2, firstName2, secondName2,eduYear2,0.0,0.0,0.0);

    }
    Student (){
        this(0,null,null,0,0.0,0.0,0.0);

    }

    double resolveGPA() {
        gpaTotal = ((gpaEconomics + gpaEngish + gpaMath) / 3);
        gpaTotal = ((double) (((int) (gpaTotal * 100))) / 100);
        return gpaTotal;
    }
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
        student1.resolveGPA();

        Student student2 = new Student();
        student2.biletNo = 13;
        student2.firstName = "Елена";
        student2.secondName = "Тыкина";
        student2.eduYear = 2003;
        student2.gpaEconomics = 4.69;
        student2.gpaMath = 4.9;
        student2.gpaEngish = 3.8;
        student2.resolveGPA();

        Student student3 = new Student();
        student3.biletNo = 43;
        student3.firstName = "Вася";
        student3.secondName = "Пупкин";
        student3.eduYear = 2001;
        student3.gpaEconomics = 3.8;
        student3.gpaMath = 3.9;
        student3.gpaEngish = 5;
        student3.resolveGPA();


        // созданые с помощью конструктора

        Student student4 = new Student(10,"Елена", "Иешкина", 1995);
        Student student5 = new Student(10,"Андрей", "Иванов", 2001,5,4,4);
        Student student6 = new Student();

        System.out.println(student6.firstName);
        System.out.println(student4.firstName);
        System.out.println(student5.firstName + " " + student5.secondName + " средний балл " + student5.resolveGPA());



        System.out.println("---------------------------------------");
        System.out.println(student1.firstName + " " + student1.secondName);
        System.out.println("Номер билета: " + student1.biletNo);
        System.out.println("Год обучения: " + student1.eduYear);
        System.out.println("Средний балл по всем предметам: " + student1.resolveGPA());
        System.out.println("---------------------------------------");
        System.out.println(student2.firstName + " " + student2.secondName);
        System.out.println("Номер билета: " + student2.biletNo);
        System.out.println("Год обучения: " + student2.eduYear);
        System.out.println("Средний балл по всем предметам: " + student2.resolveGPA());
        System.out.println("---------------------------------------");
        System.out.println(student3.firstName + " " + student3.secondName);
        System.out.println("Номер билета: " + student3.biletNo);
        System.out.println("Год обучения: " + student3.eduYear);
        System.out.println("Средний балл по всем предметам: " + student3.resolveGPA());

    }
}
