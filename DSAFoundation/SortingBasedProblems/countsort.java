public class countsort{
    static void countSortNaive(int arr[], int k, int n) {
      int[] count = new int[k];
      for (int i = 0; i < k; i++) {
        count[i] = 0;
      }
      for (int i = 0; i < n; i++) {
        count[arr[i]]++;
      }
      int index = 0;
      for (int i = 0; i < k; i++) {
        for (int j = 0; j < count[i]; j++) {
          arr[index] = i;
          index++;
        }
      }
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
      }
    }
    public static void main(String args[]) {
      int arr[] = { 5, 6, 5, 2};
      int n = 4;
      int k = 7;
      countSortNaive(arr, k, n);
    }
  }