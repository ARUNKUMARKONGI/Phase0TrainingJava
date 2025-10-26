import java.util.*;
public class recursivefactorialapproach2 {
    static long fact(int n, long res){
        if(n==0){
            System.out.println(res);
            return 0;
        }
        fact(n-1, n*res);
        return 0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n,1);
    }
}

/* public class Main {
    static long fact(int n){
        if(n==0 || n==1)
            return 1;
        return n * fact(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
     */