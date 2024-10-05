import java.util.Scanner;
public class whilehasnext {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            if (scan.hasNextInt()) {
                System.out.println("Found :" + scan.nextInt());
            }
        else{
               System.out.println("Not Found :" + scan.next());
        }
    }
    scan.close();
} }