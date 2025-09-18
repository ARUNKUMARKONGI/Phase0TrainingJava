import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        sb.append(" World");
        System.out.println("Append: " + sb);

        sb.insert(5, " Java");
        System.out.println("Insert: " + sb);

        sb.delete(5, 10);
        System.out.println("Delete: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("Replace: " + sb);

        sb.reverse();
        System.out.println("Reverse: " + sb);

        sb.reverse(); // Restore
        sb.setCharAt(0, 'X');
        System.out.println("SetCharAt: " + sb);

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());

        sc.close();
    }
}
