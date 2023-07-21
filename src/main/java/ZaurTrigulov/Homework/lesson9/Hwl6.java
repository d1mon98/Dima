package ZaurTrigulov.Homework.lesson9;

public class Hwl6 {

    public static void abc() {
        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }

    public static void main(String[] args) {
        abc();                          //методом abc создаются 2 объекта
        Hwl6 h1 = new Hwl6();           // создается 1 объект внутри метода main
        abc();                          //методом abc создаются 2 объекта
        Hwl6 h2 = new Hwl6();           // создается 1 объект внутри метода main
                                        //на последней строке метода main объекты созданные методами abc() уже не существуют,
                                        //остаются только 2 объкта созданные внутри метода main
    }


}
