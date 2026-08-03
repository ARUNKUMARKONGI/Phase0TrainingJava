import java.util.Scanner;

class Bank_Account {

    private double balance;

    void deposit(double amount) {

        if (amount > 0)
            balance += amount;
    }

    void withdraw(double amount) {

        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    double get_balance() {
        return balance;
    }
    //also demonstrate setter and getter method by using predefined 
    //press ctrl + . to open interface to select getter and setter method for balance variable
    //similarly for constructor
}

public class OOPSBankAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank_Account acc = new Bank_Account();

        acc.deposit(sc.nextDouble());
        acc.withdraw(sc.nextDouble());

        System.out.println(acc.get_balance());
    }
}