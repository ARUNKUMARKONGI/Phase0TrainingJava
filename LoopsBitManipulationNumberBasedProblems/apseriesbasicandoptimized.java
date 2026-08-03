import java.util.Scanner;
public class apseriesbasicandoptimized {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int d = s.nextInt();
        int n = s.nextInt();
        int term = a;
        for(int i=1;i<=n;i++){
            System.out.print(term + " ");
            term = term + d;
        }
    }
}
/* for(int i=1;i<=n;i++){
            int term = a + (i-1)*d;
            // a, a + d, a + 2d, a + 3d
            System.out.print(term + " ");
        } */