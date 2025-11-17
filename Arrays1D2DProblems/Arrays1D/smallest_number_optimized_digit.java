import java.util.Scanner;

public class smallest_number_optimized_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();

        if ((s == 0 && d > 1) || s > 9 * d) {
            System.out.println("Not possible");
            return;
        }

        int[] digits = new int[d];
        int sum_left = s;

        for (int i = 0; i < d; i++) {
            int start = (i == 0 && d > 1) ? 1 : 0;
            for (int dig = start; dig <= 9; dig++) {
                int max_possible = 9 * (d - i - 1);
                if (sum_left - dig <= max_possible && sum_left - dig >= 0) {
                    digits[i] = dig;
                    sum_left -= dig;
                    break;
                }
            }
        }

        System.out.print("Smallest number is ");
        for (int x : digits) {
            System.out.print(x);
        }
    }
}

/* The inputs are sum=9 and digits=2. 
There are many other possible numbers, like 18, 45, 54, 90, etc., 
with the sum of digits of 9 and the number of digits of 2.

The smallest of them is 18.

basic
------
import java.util.Scanner;

public class smallest_number_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();

        int start = (d == 1) ? 0 : (int)Math.pow(10, d - 1);
        int end = (int)Math.pow(10, d) - 1;
        boolean found = false;

        for (int num = start; num <= end; num++) {
            int temp = num, sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == s) {
                System.out.println("Smallest number is " + num);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not possible");
        }
    }
}
*/