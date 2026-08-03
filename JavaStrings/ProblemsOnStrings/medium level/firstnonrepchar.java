import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class firstnonrepchar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }
        System.out.println("No non-repeating character found.");
    }
}

/* OR use 
--------------
 for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                return;
            }
        } */