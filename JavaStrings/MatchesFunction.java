package StringBasics;

import java.util.Scanner;

public class MatchesFunction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        boolean isMatch = inputString.matches("[a-zA-Z]+");

        System.out.println("Does the string contain only letters? " + isMatch);
    }
}
