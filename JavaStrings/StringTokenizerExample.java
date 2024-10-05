package StringBasics;
import java.util.StringTokenizer;
public class StringTokenizerExample{
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("griet","hello");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}