public class Nthfibanacci {
    static int nthFibonacci(int n) {
        if (n <= 1) 
           return n;
        
        int res = 0;
        int t1 = 0;
        int t2 = 1;
        System.out.print(t1+" "+t2+" ");
        for (int i = 2; i <= n; i++) 
        {
            res = t1 + t2;
            System.out.print(res+" ");
            t1 = t2;
            t2 = res;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = nthFibonacci(n);
        System.out.println("\nNth Fibanacci is: "+result);
    }
}
