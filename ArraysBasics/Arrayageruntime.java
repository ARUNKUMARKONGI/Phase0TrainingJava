
import java.util.*;
public class Arrayageruntime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of ages: ");
        int n = scanner.nextInt();
   
        int ages[] = new int[n];
    
    
        System.out.println("Enter the ages:");
        for (int i = 0; i < n; i++) {
            ages[i] = scanner.nextInt();
        }
        //System.out.println(Arrays.toString(ages));
        
        float avg, sum = 0;

        for (int age : ages) {
            sum += age;
        }
        
        avg = sum / n;
   
        System.out.println("The average age is: " + avg);
        
        scanner.close();
    }
}

