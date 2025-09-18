import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis {
    public static boolean isWellFormed(String expression) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : expression.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                if (stack.size() == 10) {
                    System.out.println("Stack overflow. Cannot store more than 10 characters.");
                    return false;
                }
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // Unmatched closing bracket
                }

                char top = stack.pop();

               
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an expression: ");
        String input = scanner.nextLine();

        if (isWellFormed(input)) {
            System.out.println("Well Formed Parenthesis");
        } else {
            System.out.println("Not Well Formed Parenthesis");
        }

        scanner.close();
    }
}

}
