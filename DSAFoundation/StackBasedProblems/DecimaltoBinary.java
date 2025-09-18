import java.util.Scanner;
import java.util.Stack;

public class DecimaltoBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        
        while (num > 0) {
            stack.push(num % 2); 
            num /= 2;           
        }
        
        System.out.print("Binary representation: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()); 
        }
        System.out.println();
    }
}


// public static void display(Stack<Integer> stack) {
//     for (int i = stack.size() - 1; i >= 0; i--) {
//         System.out.print(stack.get(i)); // Access stack elements in reverse order
//     }
// }