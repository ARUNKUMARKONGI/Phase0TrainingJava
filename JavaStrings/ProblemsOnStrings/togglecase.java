package ProblemsOnStrings;
import java.util.*;
public class togglecase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                res.append(Character.toLowerCase(c));
            } else {
                res.append(Character.toUpperCase(c));
            }
        }

        System.out.println(res.toString());
    }
}
