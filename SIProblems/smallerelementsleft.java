import java.util.*;
public class smallerelementsleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i] > max) max = arr[i];
        }
        int freq[] = new int[max+1];
        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            int smaller = 0;
            for(int j=0;j<arr[i];j++)
            {
                smaller += freq[j];
            }
            ans[i] = smaller;
            freq[arr[i]]++;
        }
        for(int x : ans) System.out.print(x + " ");
    }
}
/* sample test case
 * Input: [5, 2, 6, 1, 4]
 * Output: [0, 0, 2, 0, 2]
 * Explanation:
 * For 5, there are no smaller elements to its left.
 * For 2, there are no smaller elements to its left.
 * For 6, there are two smaller elements (5 and 2) to its left.
 * For 1, there are no smaller elements to its left.
 * For 4, there are two smaller elements (2 and 1) to its left.
 * Total output = [0, 0, 2, 0, 2]
 */
/* Explanation of the approach:
    * 1. Read the input array and determine its size.
    * 2. Find the maximum value in the array to define the size of the frequency array.
    * 3. Create a frequency array to keep track of the occurrences of each element.
    * 4. For each element in the input array, count how many elements smaller than it have appeared so far using the frequency array.
    * 5. Store the count of smaller elements for each position in the answer array.
    * 6. Update the frequency array to include the current element.
    * 7. Finally, print the answer array.
    * The time complexity of this approach is O(n * m), where n is the number of elements in the input array and m is the maximum value in the array.   

 * 
 */