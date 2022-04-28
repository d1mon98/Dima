package ZaurTrigulov.lesson13;

public class Month {
    int monthNumber;

    public Month(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public static void main(String[] args) {

        Month m1 = new Month(65);

        switch (m1.monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 2:
                System.out.println("В этом месяце 28 дней");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            default:
                System.out.println("Такого месяца не существует");


        }


    }

}

