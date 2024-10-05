import java.util.Scanner;

public class strbuilder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] parts = input.split(" ");

        int num = Integer.parseInt(parts[0]);

        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i < parts.length; i++) {

            strBuilder.append(parts[i]+" ");
        }
        // String str = strBuilder.toString();

        System.out.println("Integer entered: " + num);
        System.out.println("String entered: " + strBuilder);

/* String is less efficient compared to stringbuilder class in java.(string class is immutable, creates new object)
When you perform operations that seem to modify a string (like concatenation), a new String object is created, 
and the original string remains unchanged. stringbuilder is mutable. */

    }
}