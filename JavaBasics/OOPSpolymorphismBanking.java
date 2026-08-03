import java.util.Scanner;

class Bank_Account {

    void deposit(int amount) {
        System.out.println("Cash Deposit : " + amount);
    }

    void deposit(double amount) {
        System.out.println("Online Deposit : " + amount);
    }
}

public class OOPSpolymorphismBanking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Bank_Account acc = new Bank_Account(); 

        acc.deposit(sc.nextInt());
        acc.deposit(sc.nextDouble());
    }
}