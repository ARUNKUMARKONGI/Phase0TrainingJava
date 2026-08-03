

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

public class OOPSPolymorphismethodOverriding {

    public static void main(String[] args) {

     Bank_Account acc = new Savings_Account(); //upcasting
        //which method is called decided at runtime based on the object type,
        //  not reference type
        //for example here reference type is Bank_Account but
        //  object type is Savings_Account

            acc.interest();
    }

}