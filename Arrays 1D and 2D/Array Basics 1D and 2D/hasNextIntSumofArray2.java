import java.util.*;
public class hasNextIntSumofArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] values = new int[20];
        int count = 0;

        while (count < 4) {
            if (sc.hasNextInt()) {
                values[count] = sc.nextInt();
                count++;
            } else {
                
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); 
            }
        }
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += values[i];
        }
        
        System.out.println("Sum of the entered values: " + sum);
        sc.close();
    }
}

