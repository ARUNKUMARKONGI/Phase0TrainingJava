import java.util.Scanner;
public class floatingdivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 3;

        int result = a / b;
        double wrong = a / b;
        double right = a / 3.0;

        System.out.println("int division (a / b): " + result);
        System.out.println("stored in double but still truncated (a / b): " + wrong);
        System.out.println("correct floating division (a / 3.0): " + right);
    }
}
