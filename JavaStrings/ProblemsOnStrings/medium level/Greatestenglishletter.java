package ProblemsOnStrings;
import java.util.Scanner;

public class Greatestenglishletter {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            char result = 0;
            for (char c : s.toCharArray()) {
                if (Character.isLetter(c) && s.indexOf(Character.toLowerCase(c)) != -1 && s.indexOf(Character.toUpperCase(c)) != -1) {
                    result = (char) Math.max(result, Character.toUpperCase(c));
                }
            }
            System.out.println(result == 0 ? "No such letter exists" : result);
        }
    }
    
/*
s = input()
result = ''
for c in s:
    if c.isalpha() and c.lower() in s and c.upper() in s:
        result = max(result, c.upper())
print(result if result else 'No such letter exists') */
