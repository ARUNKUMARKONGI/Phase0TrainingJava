import java.util.*;

public class quicksortprogram {

    static void quicksort(int[] a, int left, int right) {
        if (left < right) {
            int pivot = a[left];
            int i = left + 1;
            int j = right;

            while (i <= j) {
                while (i <= right && a[i] <= pivot) i++;
                while (a[j] > pivot) j--;
                if (i < j) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }

            int t = a[left];
            a[left] = a[j];
            a[j] = t;

            quicksort(a, left, j - 1);
            quicksort(a, j + 1, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        quicksort(a, 0, n - 1);

        for (int x : a) System.out.print(x + " ");
    }
}
