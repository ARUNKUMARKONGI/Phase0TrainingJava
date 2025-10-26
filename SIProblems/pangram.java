package SIProblems;

import java.util.*;

public class pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();
        Set<Character> charSet = new  HashSet<>();
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                charSet.add(c);
            }
        }

        if (charSet.size() == 26) {
            System.out.println("The given string is a pangram.");
        } else {
            System.out.println("The given string is not a pangram.");
        }
    }
}
/* sample test case
 * Input: "The quick brown fox jumps over the lazy dog"
 * Output: The given string is a pangram.
 */
//what is pangram?
/* Explanation:
 * A pangram is a sentence that contains every letter of the alphabet at least once.
 * The given string is a pangram because it includes all the letters from 'a' to 'z'.
 */
