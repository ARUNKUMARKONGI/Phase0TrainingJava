package ProblemsOnStrings;
import java.util.Scanner;
public class prefixsuffixequality {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    String s = sc.next();
    int le = s.length();
    String s1 = str.substring(0,le);
    String s2 = str.substring(str.length()-le);
    if(s1.equals(s2)) System.out.println("Yes");
    else System.out.println("No");
    
    }
}
/* str = smartintsmart
s = smart
l = 5 (length of s)
s1 = str.substring(0,5) = "smart"
s2 = str.substring(13-5) = str.substring(8) = "smart" */