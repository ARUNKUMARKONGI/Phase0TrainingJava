package StringBasics;
import java.util.Scanner;
public class StringSplit {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Name and Age separated by a space: ");
            String input = scanner.nextLine();
            String[] parts = input.split(" ");

            String name = String.join(" ",parts[0],parts[1]);
            String age = parts[2];

            System.out.printf("Entered Name is: %s and age is: %s%n", name, age);

            scanner.close();
        }
    }

