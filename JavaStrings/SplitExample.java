package StringBasics;

import java.util.Arrays;
import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("Words in the sentence: " + Arrays.toString(words));
    }
}

