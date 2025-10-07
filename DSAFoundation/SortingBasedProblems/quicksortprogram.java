package SortingBasedProblems;

import java.util.*;

public class quicksortprogram {
    static void quicksort(int[] a, int left, int right) {
        if (left < right) {
            int pivot = a[left];
            int i = left;
            int j = right;

            while (i < j) {
                while (i <= right && a[i] <= pivot) {
                    i++;
                }
                while (a[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            int temp = a[left];
            a[left] = a[j];
            a[j] = temp;

            quicksort(a, left, j - 1);
            quicksort(a, j + 1, right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to sort? ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Enter elements for the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        quicksort(a, 0, n - 1);

        System.out.print("Sorted elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
