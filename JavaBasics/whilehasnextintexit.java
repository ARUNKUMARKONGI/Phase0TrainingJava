import java.util.*;
public class whilehasnextintexit {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()) {
            if (scan.hasNextInt()) {
               
                System.out.println("Found: " + scan.nextInt());
            } else {
                String input = scan.next();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                System.out.println("Not Found: " + input);
            }
        }
        scan.close();
    }
}
