package StringBasics.Problems;

import java.util.Scanner;

public class MultiplyStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from the user
        //System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        StringBuilder input2=new StringBuilder(input);
        // System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        String result = String.valueOf(MultiplyStrings(input2,k));
        if(result.isEmpty())
        {
            System.out.println("String is empty");
        }
        else
        System.out.println("Result after Multiplying " + k + " times:\n " + result);
    }

    private static StringBuilder MultiplyStrings(StringBuilder input, int k) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(input).append(" ");
        }
        return result;
    }
}

