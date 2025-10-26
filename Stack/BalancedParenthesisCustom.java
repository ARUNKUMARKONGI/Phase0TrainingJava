/* input=((({})))
output=Well Formed Parenthesis


input={}[(]}
output=Not Well Formed Parenthesis
 */


import java.util.Scanner;

public class BalancedParenthesisCustom {
    static final int MAX_SIZE = 10;
    static char[] stack = new char[MAX_SIZE];
    static int top = -1;

    private static void push(char ch) {
        if (top < MAX_SIZE - 1) {
            stack[++top] = ch;
        } else {
            System.out.println("Stack overflow. Cannot store more than 10 characters.");
            System.exit(0); 
        }
    }
    private static char pop() {
        if (top != -1) {
            return stack[top--];
        }
        return '\0';
    }

  
    private static boolean isWellFormed(String expression) {
        boolean flag=false;
        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (top==-1) {
                    return false; // for example if expression starts with closing bracket }[]{
                }
                char top = pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;   
                }
            }
        }
        if(top==-1){
        flag=true; // If stack is empty, parentheses are well formed
        }
        return flag;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter the expression to check:");
        String expression = scanner.nextLine();
  

        if (isWellFormed(expression)) {
            System.out.println("Well Formed Parenthesis");
        } else {
            System.out.println("Not Well Formed Parenthesis");
        }
        scanner.close();
    }
}


