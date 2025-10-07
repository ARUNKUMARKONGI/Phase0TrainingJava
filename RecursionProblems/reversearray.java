import java.util.*;

public class reversearray {
    public static void print_reverse(int arr[], int index, int n) {
        if (index == n)
            return;
        print_reverse(arr, index + 1, n);
        System.out.print(arr[index] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        print_reverse(arr, 0, n);
    }
}
