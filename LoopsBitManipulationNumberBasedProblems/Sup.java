import java.util.*;
public class SuperDigit {
    public static int super_digit(long n) {
        if (n < 10) 
        {
        return (int)n;
        }

        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return super_digit(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Super Digit: " + super_digit(n));
    }
}
4
// Sample Input:
// 9875
// Sample Output:
// 2