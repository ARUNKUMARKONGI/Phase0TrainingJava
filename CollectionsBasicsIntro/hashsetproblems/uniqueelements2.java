import java.util.*;
public class uniqueelements2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int j=0;j<m;j++) b[j]=sc.nextInt();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<n;i++) set.add(a[i]);
        for(int j=0;j<m;j++) set.add(b[j]);
        for(int x:set) System.out.print(x+" ");
    }
}
