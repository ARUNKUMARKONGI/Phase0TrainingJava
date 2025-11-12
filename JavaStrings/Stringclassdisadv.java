import java.util.*;

public class Stringclassdisadv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                str = str + s.charAt(i);
            }
        }
        System.out.println(str);
    }
}
// time complexity O(n^2) bcz creates a new string every iteration.
//sample input: "Hello World"
//sample output: "HelloWorld"