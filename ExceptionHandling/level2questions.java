package ExceptionHandling;

import java.util.*;

public class level2questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        String[] employees = new String[n];
        
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine();
            if (input.equals("null")) {
                employees[i] = null;
            } else {
                employees[i] = input;
            }
        }
        
        int q = sc.nextInt();
        
        for (int i = 0; i < q; i++) {
            int index = -999;
            try {
                index = sc.nextInt();
                
                if (index < 0 || index >= n) {
                    throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds");
                }
                
                String employee = employees[index];
                
                if (employee == null) {
                    throw new NullPointerException("Employee record is null at index " + index);
                }
                
                int length = employee.length();
                
                System.out.println("Employee " + index + ": " + employee + " (Length: " + length + ")");
                
            } catch (NullPointerException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        
        sc.close();
    }
}


/* import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String register_number = sc.nextLine();
        String mobile_number = sc.nextLine();
        sc.close();

        try {
            if (register_number.length() != 9) {
                throw new IllegalArgumentException("Register Number does not contain exactly 9 characters");
            }
            if (!register_number.matches("\\d{2}[A-Za-z]{3}\\d{4}")) {
                throw new NoSuchElementException("Registration Number cannot contain any character other than digits and alphabets in format specified");
            }
            if (mobile_number.length() != 10) {
                throw new IllegalArgumentException("Mobile Number does not contain exactly 10 characters");
            }
            if (!mobile_number.matches("\\d{10}")) {
                throw new NumberFormatException("Mobile Number cannot contain any character other than a digit");
            }
            System.out.println("Valid");
        } catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("Invalid");
            System.out.println(e.toString());
        } //no need to mention numberformat as it is subclass of illegalargument
    }
} 
    

// You are using Java
import java.util.*;

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String isbn_input = sc.nextLine();
        sc.close();

        try {
            if (!isbn_input.matches("\\d{9}")) {
                throw new InvalidInputException("ISBN must be exactly 9 digits");
            }
            int checksum = 0;
            for (int i = 0; i < 9; i++) {
                int digit = isbn_input.charAt(i) - '0';
                checksum += digit * (i + 1);
            }
            checksum = checksum % 11;
            System.out.println("ISBN : " + isbn_input + (checksum == 10 ? "X" : checksum));
        } catch (InvalidInputException e) {
            System.out.println("InvalidInputException: " + e.getMessage());
        }
    }
}
*/
