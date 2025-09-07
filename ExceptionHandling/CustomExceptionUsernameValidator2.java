package ExceptionHandling;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidCharacterException extends Exception {
    public InvalidCharacterException(String message) {
        super(message);
    }
}

public class CustomExceptionUsernameValidator2 {
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
            if (!username.matches("[A-Za-z0-9]+")) {
                throw new InvalidCharacterException("Invalid Username: Username cannot contain special characters");
            }
            System.out.println("Username is valid: " + username);
        } catch (InvalidUsernameException | InvalidCharacterException e) {
            System.out.println(e.getMessage());
        }
    }
}
