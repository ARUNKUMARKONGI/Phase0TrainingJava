package StringBasics;

import java.util.Scanner;

public class StringBuilderMultiplyStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        String result = concatenateString(inputString, k);

        System.out.println("Result after concatenating " + k + " times: " + result);
    }
    private static String concatenateString(String input, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(input).append(" ");
        }
        return result.toString();
    }
}
//try to return just result, in that case make return type as StringBuilder and
//in main function, String result = String.ValueOf(concatenateString(inputString,k));
//or StringBuilder result = concatenateString(inputString,k);
 //System.out.println(result); //compiler automatically converts to toString
