import java.util.Scanner;

public class DecimaltoBinary {
    
    public static String decimalToBinary(int num) {
        if (num == 0) {
            return ""; // Base case: if the number is 0
        }
        return decimalToBinary(num / 2) + (num % 2); // Recursive call
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        String binary = decimalToBinary(num);
        if (binary.isEmpty()) {
            binary = "0"; // Handle the case when input is 0
        }
        
        System.out.println("Binary representation: " + binary);
    }
}
