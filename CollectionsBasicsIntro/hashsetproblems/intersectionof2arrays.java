import java.util.*;
public class intersectionof2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int j=0;j<m;j++) b[j]=sc.nextInt();
        HashSet<Integer> setb = new HashSet<>();
        for(int j=0;j<m;j++) setb.add(b[j]);
        LinkedHashSet<Integer> res = new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            if(setb.contains(a[i])) res.add(a[i]);
        }
        for(int x:res) System.out.print(x+" ");
    }
}
//preserve the order of first array

/* n=5, m=4
arr1 = [1, 2, 2, 3, 4]
arr2 = [2, 3, 5, 6]
output = [2, 3]
 */