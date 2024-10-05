import java.util.Scanner;

public class hasNextIntSumofIntfromStrings {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string with integer values: ");
        String input = scan.nextLine();

        Scanner sc = new Scanner(input);
        int sum=0;
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                 sum = sum + sc.nextInt();
            } else {
                sc.next();
            }
        }
        System.out.println("Extracted Integer Sum: "+sum);
sc.close();
    }
}


