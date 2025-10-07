import java.util.*;

public class isbitonicsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        int i=1;
        while(i<n && a[i]>a[i-1])
            i++;

        while(i<n && a[i]<a[i-1])
            i++;

        if(i==n)
            System.out.print("true");
        else
            System.out.print("false");
    }
}
