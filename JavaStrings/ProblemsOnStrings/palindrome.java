package ProblemsOnStrings;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        boolean isPalindrome = true;
        int start = 0, end = s.length() - 1;
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        if (isPalindrome)
            System.out.println(s + " is a palindrome.");
        else
            System.out.println(s + " is not a palindrome.");
    }
}

