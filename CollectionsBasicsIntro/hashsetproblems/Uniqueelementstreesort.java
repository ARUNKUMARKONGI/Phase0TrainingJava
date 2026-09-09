import java.util.*;

public class Uniqueelementstreesort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeSet<Integer> result = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            result.add(num);
        }

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}

//sample input: 5 1 2 3 2 1
// output: 1 2 3