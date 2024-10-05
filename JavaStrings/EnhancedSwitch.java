package StringBasics;

public class EnhancedSwitch {
    public static void main(String[] args) {
        int itemCode=3;
        switch (itemCode) {
            case 1 -> System.out.println("CSE");
            case 2 -> System.out.println("IT");
            case 3,4 -> System.out.println("ECE");
        }
    }
}
