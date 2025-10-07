import java.io.*;
import java.util.*;

public class firstlast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer> l = new ArrayList<>();
    for(int i = 0; i<n; i++) l.add(sc.nextInt());
    int x = sc.nextInt();
    System.out.println(l.indexOf(x) + " " + l.lastIndexOf(x)); 
    
    }
}