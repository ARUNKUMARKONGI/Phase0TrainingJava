 import java.util.Scanner;

class hasnextint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            System.out.println("invalid integer input.");
            return;
        }
        int a = sc.nextInt();
        
        if (!sc.hasNextInt()) {
            System.out.println("invalid integer input.");
            return;
        }
        int b = sc.nextInt();
        
        if (( a > Integer.MAX_VALUE - b) ||
            ( a < Integer.MIN_VALUE - b)) {
            System.out.println("Integer range exceeded.");
        } else {
            int res = a + b;
            System.out.println("sum of " + a + " and " + b + " is: " + res);
        }
    }
}










/*

Assume limit as 1000
a = 800
b = 300
→ a > 1000 - b
→ 800 > 700 → true
→ Output:

Overflow would happen if we add a + b */