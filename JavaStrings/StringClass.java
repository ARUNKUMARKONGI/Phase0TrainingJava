import java.util.*;

public class StringClassdisadvan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) != ' ') {
                res.append(sb.charAt(i));
            }
        }
        System.out.println(res.toString());
    }
}
