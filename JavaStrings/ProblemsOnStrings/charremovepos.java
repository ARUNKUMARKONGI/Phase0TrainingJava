import java.util.*;
public class charremovepos {
   
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the string: ");
            String str = scanner.nextLine();
    
            System.out.print("Enter the starting position: ");
            int position = scanner.nextInt();
    
            System.out.print("Enter the number of characters to remove: ");
            int num = scanner.nextInt();
    
            int length = str.length();
            System.out.println("Length of string: " + length);
    
            if (position < 1 || position > length || num < 0 || position + num - 1 > length) {
                System.out.println("Invalid input");
            } else {
                StringBuilder sb = new StringBuilder(str);
                sb.delete(position - 1, position - 1 + num);
                System.out.println("Modified string: " + sb.toString());
            }
    
            scanner.close();
        }
    }
    
/* above approach time complexity is O(n) and space complexity 
is O(1) as stringubuilder is mutable allows in place modifications. */
/* 
    Naive approach
    ---------------
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the starting position: ");
        int position = scanner.nextInt();

        System.out.print("Enter the number of characters to remove: ");
        int num = scanner.nextInt();

        int length = str.length();
        System.out.println("Length of string: " + length);

        if (position < 1 || position > length || num < 0 || position + num - 1 > length) {
            System.out.println("Invalid input");
        } else {
            String modifiedString = str.substring(0, position - 1) + str.substring(position - 1 + num);
            System.out.println("Modified string: " + modifiedString);
        }

        scanner.close();
    }
}


O(n) space complexity as new string is created.
In Java, String objects are immutable, meaning every modification
 (like slicing with substring) creates a new String object.

 */