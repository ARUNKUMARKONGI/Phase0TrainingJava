import java.util.Scanner;
public class PalindromeRecursion {
    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end)  //for even length greater than equal is compulsory
            return true;
        if (s.charAt(start) != s.charAt(end))
            return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        boolean result = isPalindrome(s, 0, s.length() - 1);
        
        if (result)
            System.out.println(s + " is a palindrome.");
        else
            System.out.println(s + " is not a palindrome.");
    }
}

