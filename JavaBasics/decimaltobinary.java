import java.util.Scanner;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            System.out.println(Integer.toBinaryString(n));
        }
    }
}

/* import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(n == 0) {
                System.out.println("0");
                continue;
            }
            StringBuilder sb = new StringBuilder();
            while(n > 0) {
                sb.append(n % 2);
                n /= 2;
            }
            System.out.println(sb.reverse().toString());
        }
    }
} 
    
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            if(n == 0) {
                System.out.println("0");
                continue;
            }
            String binary = "";
            while(n > 0) {
                binary = (n % 2) + binary;
                n = n / 2;
            }
            System.out.println(binary);
        }
    }
}

*/
