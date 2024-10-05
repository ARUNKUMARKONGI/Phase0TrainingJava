package patterns;
import java.util.Scanner;
public class reverse5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        
    }
}
/* public class Main {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i >= 1; i--) {
            System.out.println((num + " ").repeat(i).trim());
        }
    }
} */