import java.util.Scanner;
public class readintthenstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        String str = sc.nextLine(); //can read using next but not including spaces
        System.out.println("You entered integer: " + num);
        System.out.println("You entered string: " + str);
    }
}
