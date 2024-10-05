package StringBasics;

import java.util.Scanner;

public class replaceFirstExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine();

        // Replace the first occurrence of the specified word
        String modifiedSentence = sentence.replaceFirst(wordToReplace, replacement);

        System.out.println("Modified sentence: " + modifiedSentence);
    }
}
