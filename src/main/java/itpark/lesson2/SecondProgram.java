package itpark.lesson2;

public class SecondProgram {
    public static void main(String[] args) {

        long summa = summa(3, 9);
        System.out.println("Сумма двух чисел = " +summa);
        long subtaction = minus(3,4);
        System.out.println("Разность двух чисел = " +subtaction);
        long result = multyplyAndsumma(55);
        System.out.println("Результат = " +result);
        long result2 = formula(5,299792458);
        System.out.println("Величина энергии = " +result2);


    }
    /**
     * Метод будет складывать два аргумента и возвращать результат этой операции
     * @param arg1 первый аргумент
     * @param arg2 второй аргумент
     * @return результат сложения двух чисел
     */
    public static long summa(int arg1, int arg2) {
    /*В этой переменной будет хранится результат сложения двух чисел.
    Результат вычисления должен быть совместим по типу с аргументами,
    над которыми осуществляются операции сложения */
        return arg1 + arg2;
    }

    public static long minus(int arg1, int arg2){
        return arg1 - arg2;
    }

    public static long multyplyAndsumma(int arg1) {
        return 3L *arg1 +15;
    }

    /**
     * Метод будет складывать два аргумента и возвращать результат этой операции
     * @param m масса объекта
     * @param c скорость света в вакууме = 299792458 м/с2
     * @return энергия объекта
     */
    public static long formula (int m, int c){
        return (long) m *c*c;
    }

}

