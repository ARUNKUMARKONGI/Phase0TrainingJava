import java.util.Scanner;

public class MagicNumber {
    public static int superDigit(long n) {
        if (n < 10) {
            return (int) n;
        }

        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return superDigit(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int result = superDigit(num);
        
        System.out.println("Super Digit: " + result);
        if (result == 1) {
            System.out.println(num + " is a Magic Number.");
        } else {
            System.out.println(num + " is not a Magic Number.");
        }
    }
}
