import java.util.Scanner;

public class DecimaltoBinary {
    
    public static String decimalToBinary(int num) {
        if (num == 0) {
            return ""; 
        }
        return decimalToBinary(num / 2) + (num % 2); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        String binary = decimalToBinary(num);
        if (binary.isEmpty()) {
            binary = "0"; 
        }
        
        System.out.println("Binary representation: " + binary);
    }
}
