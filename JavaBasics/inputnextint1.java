
import java.util.*;
public class inputnextint1 {

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter value: ");
        if(scan.hasNextInt())
        {
            int x = scan.nextInt();
            System.out.println("Your entered value: " + x);
        }
        else {
            System.out.println("Please enter the Integer value. ");
        }
        scan.close();
        System.out.println(Math.sqrt(64));  

    }
}

