import java.util.*;

public class longestconsecutivones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        int count=0, max_len=0;
        for(int i=0;i<n;i++){
            if(a[i]==1)
                count++;
            else
                count=0;
            if(count>max_len)
                max_len=count;
        }
        System.out.print(max_len);
    }
}
