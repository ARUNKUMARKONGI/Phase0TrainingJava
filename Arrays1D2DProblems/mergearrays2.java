import java.util.*;
public class mergearrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int j=0;j<m;j++) b[j]=sc.nextInt();
        int[] res = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a[i]<=b[j]) res[k++]=a[i++];
            else res[k++]=b[j++];
        }
        while(i<n) res[k++]=a[i++];
        while(j<m) res[k++]=b[j++];
        for(int x:res) System.out.print(x+" ");
    }
}
