public class Warmup1 {

    boolean weekday;
    boolean vacation;

    Warmup1(boolean weekday, boolean vacation) {
        this.weekday = weekday;
        this.vacation = vacation;
    }

    public static void main(String[] args) {
        Warmup1 day1 = new Warmup1(true, false);
        Warmup1 day2 = new Warmup1(false, false);
        Warmup1 day3 = new Warmup1(false, true);


        System.out.println("Спим сегодня? - " + day1.sleepIn(day1.weekday, day1.vacation));
        System.out.println("Спим сегодня? - " + day2.sleepIn(day2.weekday, day2.vacation));
        System.out.println("Спим сегодня? - " + day3.sleepIn(day3.weekday, day3.vacation));

    }

    //method
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;

    }

}
