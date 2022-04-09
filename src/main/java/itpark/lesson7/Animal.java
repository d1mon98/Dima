package itpark.lesson7;

import java.util.Scanner;

//class
public class Animal {
    String name;
    String nickname;
    int run;
    int maxrun;
    int swim;
    int maxswim;

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getRun() {
        return run;
    }

    public int getMaxrun() {
        return maxrun;
    }

    public int getSwim() {
        return swim;
    }

    public int getMaxswim() {
        return maxswim;
    }

    //run and swim methods
    public void runLenght() {

    }

    public void setRun(int run) {
        this.run = run;
    }


    public void setSwim(int swim) {
        this.swim = swim;
    }

    public void runAnimals() {
        System.out.println("Введите расстояние которое должен преодолеть бегом " + getName() + " " + getNickname());
        Scanner scanner = new Scanner(System.in);
        int run = scanner.nextInt();
        setRun(run);
        if ((run <= maxrun) && (run > 0)) {
            System.out.println(getName() + " " + getNickname() + " пробежал " + getRun() + " м, и способен пробежать " +
                    "ещё " + (getMaxrun() - getRun()) + " м");
            System.out.println("");
        } else {
            System.out.println(getRun() + " м - это слишком большое расстояние для животного " + getName() + " " + getNickname() + ", оно способно пробежать максимум " + getMaxrun() + "м");
            System.out.println("");
        }
    }

    public void swimAnimals() {
        System.out.println("Введите расстояние которое проплыть " + getName() + " " + getNickname());
        Scanner scanner = new Scanner(System.in);
        int swim = scanner.nextInt();
        setSwim(swim);
        if ((swim <= maxswim) && (swim > 0)) {
            System.out.println(getName() + " " + getNickname() + " проплыл " + getSwim() + " м, и способен проплыть " +
                    "ещё " + (getMaxswim() - getSwim()) + " м");
            System.out.println("");
        } else {
            System.out.println(getSwim() + " м - это слишком большое расстояние для животного " + getName() + " "
                    + getNickname() + ", оно способно проплыть максимум " + getMaxswim() + " м");
            System.out.println("");
        }

    }

}




