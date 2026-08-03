import java.util.Scanner;

class Bank_Account {

    void interest() {
        System.out.println("General Interest");
    }
}

class Savings_Account extends Bank_Account {

    @Override
    void interest() {
        System.out.println("Savings Interest : 4%");
    }
}

public class OOPSPolymorphismme {

    public static void main(String[] args) {

        Bank_Account acc = new Savings_Account();

        acc.interest();
    }
}