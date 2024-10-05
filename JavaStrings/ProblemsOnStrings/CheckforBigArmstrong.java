package StringBasics.Problems;
import java.util.Scanner;
import java.math.BigInteger;
public class CheckforBigArmstrong {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                String input = scanner.nextLine();
                if (isArmstrongNumber(input)) {
                    System.out.println(input + " is an Armstrong number.");
                } else {
                    System.out.println(input + " is not an Armstrong number.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Input beyond the capacity of long integer.");
            }
        }
        public static boolean isArmstrongNumber(String numStr) {
            int length = numStr.trim().length();
            long sum = 0;
            //BigInteger sum = BigInteger.ZERO;
            for (int i = 0; i < length; i++) {
                int digit = Character.getNumericValue(numStr.charAt(i));
                sum += Math.pow(digit, length);
               // sum = sum.add(BigInteger.valueOf(digit).pow(length));
            }
            return sum == Long.parseLong(numStr);
            //BigInteger res = new BigInteger(numStr);
           // return sum.equals(res);
        }
    }


/*  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String input = scanner.nextLine();
            long number = Long.parseLong(input);

            if (isArmstrongNumber(number)) {
                System.out.println(input + " is an Armstrong number.");
            } else {
                System.out.println(input + " is not an Armstrong number.");
            }
        } catch (NumberFormatException ne) {
            System.out.println("Error: Input is not a valid integer.");
        } catch (ArithmeticException ae) {
            System.out.println("Error: Input beyond the capacity of long integer.");
        }
    }

    public static boolean isArmstrongNumber(long num) {
        String numStr = Long.toString(num);
        int length = numStr.length();
        long sum = 0;

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, length);
        }

        return sum == num;
    }
}*/
