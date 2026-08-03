package ProblemsOnStrings;

public import java.util.*;

public class characteroccurringtogether {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char ch = sc.next().charAt(0);

        boolean found = false;

        for(int i = 0; i < str.length() - 1; i++) {

            if(str.charAt(i) == ch && str.charAt(i + 1) == ch) {
                found = true;
                break;
            }
        }

        if(found) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
} 
