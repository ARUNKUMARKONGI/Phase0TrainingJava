import java.util.*;
public class countvowels {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            int count = 0;
            for (char ch : input.toLowerCase().toCharArray()) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
    

/*     import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String vowels = "aeiouAEIOU";
        int count = 0;
        
        // Loop through each character in the string
        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        
        // Display the result
        System.out.println("Number of vowels: " + count);
        
        scanner.close();
    }
}
 */