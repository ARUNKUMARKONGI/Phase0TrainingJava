package StringBasics;

import java.util.Scanner;

public class StringsExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        scanner.close();
        System.out.println(wordsreverse(text));
    }

    public static String wordsreverse(String text) {
        String[] words = text.split(" ");
        StringBuilder result_str = new StringBuilder();
        for (String word : words) {
            if (word.length() >= 4) {
                result_str.append(new StringBuilder(word).reverse());
            } else {
                result_str.append(word);
            }
            result_str.append(" ");
        }
        return result_str.toString();
    }
}
