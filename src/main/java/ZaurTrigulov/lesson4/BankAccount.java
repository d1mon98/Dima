package ZaurTrigulov.lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    //методы

    double accountRefill(double refillAmount) {
        return balance += refillAmount;
    }

    double accountWithdrawal(double withdrawalAmount) {
        return balance -= withdrawalAmount;
    }


    public static void main(String[] args) {
        BankAccount bA = new BankAccount();
        bA.id = 1;
        bA.name = "Alex Isbell";
        bA.balance = 5000 - 402;

        System.out.println(bA.name + ", " + bA.balance);

        bA.accountRefill(2500);

        System.out.println(bA.name + ", " + bA.balance);

        bA.accountWithdrawal(7000);

        System.out.println(bA.name + ", " + bA.balance);

    }
}
