package ExceptionHandling;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

public class CustomExceptionUsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        sc.close();

        try {
            if (username.length() < 5) {
                throw new InvalidUsernameException("Invalid Username: Username must be at least 5 characters long");
            }
            if (username.contains(" ")) {
                throw new InvalidUsernameException("Invalid Username: Username cannot contain spaces");
            }
            System.out.println("Username is valid: " + username);
        } catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        }
    }
}
