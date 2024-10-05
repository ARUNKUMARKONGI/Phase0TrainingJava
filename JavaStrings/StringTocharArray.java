package StringBasics;
import java.util.Scanner;

public class StringTocharArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] charArray = inputString.toCharArray();

        System.out.println("Character array:");

        for (char c : charArray) {
            System.out.print(c + " ");
        }

        scanner.close();
    }
}

