import java.util.Scanner;

public class superdigit {
    public static int superDigit(long n) {
        if (n < 10) {
            return (int)n;
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
        System.out.println("Super Digit: " + superDigit(num));
    }
}
