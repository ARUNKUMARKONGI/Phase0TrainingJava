import java.util.*;

public class Decimaltobinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            String bin = "";
            if(n==0) bin="0";
            else{
                while(n>0){
                    bin = (n%2) + bin;
                    n = n/2;
                }
            }
            System.out.println(bin);
        }
    }
}
/*
        while(t-- > 0){
            int n = sc.nextInt();
            System.out.println(Integer.toBinaryString(n));
        }
    }
}
 */


