package ProblemsOnStrings;
import java.util.Scanner;
public class substringsendingwithconsonants {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int n = str.length();
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = str.substring(i, j+1);
                char ch = sub.charAt(sub.length()-1);
                if("aeiouAEIOU".indexOf(ch) == -1) cnt++;
            }
        }
        System.out.print(cnt);
    }
}
