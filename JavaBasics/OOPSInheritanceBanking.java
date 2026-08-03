import java.util.Scanner;

class Bank_Account {

    double balance;

    void display() {
        System.out.println(balance);
    }
}

class Savings_Account extends Bank_Account {

    double interest;

    void calculate_interest() {

        interest = balance * 0.04;

        System.out.println(interest);
    }
}

public class OOPSInheritanceBanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Savings_Account acc = new Savings_Account();

        acc.balance = sc.nextDouble();

        acc.display();
        acc.calculate_interest();

        
    }
}