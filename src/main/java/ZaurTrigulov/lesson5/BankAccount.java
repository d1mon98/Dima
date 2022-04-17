package ZaurTrigulov.lesson5;

public class BankAccount {

    int id;
    String firstName;
    String secondName;
    double balanceAmount;

    double popolnenieScheta(double summaPlus) {
        balanceAmount += summaPlus;
        return balanceAmount;
    }

    double snyatieSoScheta(double summaMinus) {
        balanceAmount -= summaMinus;
        return balanceAmount;
    }

    void showInfo() {
        System.out.println("Account id: " + id + "\nИмя: " + firstName + "\nФамилия: " + secondName + "\nBalance: "
                + "$" + balanceAmount + "\n--------------------------------------------------");
    }

}

class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        ba1.id = 232;
        ba1.firstName = "Dmitrii";
        ba1.secondName = "Ieshkin";
        ba1.balanceAmount = 459;
        ba1.showInfo();
        ba1.popolnenieScheta(400);
        ba1.showInfo();
        ba1.snyatieSoScheta(850);
        ba1.showInfo();

    }
}

