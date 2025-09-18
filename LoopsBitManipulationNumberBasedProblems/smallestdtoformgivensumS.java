import java.util.Scanner;
public class smallestdtoformgivensumS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();
        int start = (int)Math.pow(10, d-1);
        int end = (int)Math.pow(10, d) - 1;
        int ans = -1;
        for(int num=start; num<=end; num++) {
            int temp = num, sum=0;
            while(temp>0) {
                sum += temp%10;
                temp /= 10;
            }
            if(sum==s) {
                ans = num;
                break;
            }
        }
        if(ans==-1) System.out.println("Not possible");
        else System.out.println(ans);
    }
}



/* import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int d = sc.nextInt();

        if(s > 9*d || (s==0 && d>1)) {
            System.out.println("Not possible");
            return;
        }

        int[] digits = new int[d];
        s--;
        for(int i=d-1; i>0; i--) {
            if(s>9) {
                digits[i] = 9;
                s -= 9;
            } else {
                digits[i] = s;
                s = 0;
            }
        }
        digits[0] = s+1;

        for(int x:digits) System.out.print(x);
    }
}
 */