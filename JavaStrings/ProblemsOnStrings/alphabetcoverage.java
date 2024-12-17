package JavaStrings.ProblemsOnStrings;
import java.util.HashSet;

public class alphabetcoverage {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";

        if (containsAllAlphabets(s)) {
            System.out.println("The string contains all alphabets.");
        } else {
            System.out.println("The string does not contain all alphabets.");
        }
    }

    public static boolean containsAllAlphabets(String s) {
        HashSet<Character> set = new HashSet<>();

        // Convert to lowercase and iterate through the string
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') { 
                set.add(c);
            }
        }

        return set.size() == 26; // Check if all 26 letters are present
    }
}

