import java.util.*;

class arraylistexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            int x = sc.nextInt();

            if (x == -1)
                break;

            arr.add(x);
        }

        for (int x : arr)
            System.out.print(x + " ");
    }
}