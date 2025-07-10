import java.util.Scanner;
public class countwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            if (ch!= ' ' && flag==false) {
                count++;
                flag = true;
            } else if (ch == ' ') {
                flag = false;
            }
        }
        System.out.println(count);
    }
}


/* alternative approach
------------------------
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i)) && (i == 0 || Character.isWhitespace(str.charAt(i - 1)))) {
                count++;
            }
        }
        System.out.println("Number of words: " + count);
    }
} */
