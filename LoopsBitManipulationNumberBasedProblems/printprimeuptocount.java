import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int count = sc.nextInt();
            int num = 2;
            int printed = 0;
            while (printed < count) {
                boolean prime = true;
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    System.out.print(num + " ");
                    printed++;
                }
                num++;
            }
            System.out.println();
        }
    }
}
