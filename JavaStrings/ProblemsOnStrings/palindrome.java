import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        boolean flag = true;
        int start = 0, end = s.length() - 1;
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                flag = false;
                break;
            }
            start++;
            end--;
        }
        if(flag)
            System.out.println(s + " is a palindrome.");
        else
            System.out.println(s + " is not a palindrome.");
    }
}


/* naive approach
------------------------
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        boolean flag = true;
        
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
} */


/* other approaches
-------------------------------
import java.util.*;
import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
      String str, reverse = ""; 
      Scanner in = new Scanner(System.in);
     
      str = in.nextLine();
     
      int length = str.length();
      for (int i = length - 1; i >= 0; i--)
         reverse = reverse + str.charAt(i);
     if (str.equals(reverse))
         System.out.println("Palindrome");
      else
         System.out.println("Not a palindrome");
}     
}

The above code can be optimized by avoiding repeated string concatenation, 
which is inefficient due to the creation of new strings at each step. 
Instead, we can use a StringBuilder to reverse the string, 
as it operates in-place and is more efficient.

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder reverse = new StringBuilder(str).reverse();
        if (str.equals(reverse.toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}

if case insensitive
String str = in.nextLine(); 
String lowerStr = str.toLowerCase();
StringBuilder reverse = new StringBuilder(lowerStr).reverse();
 */