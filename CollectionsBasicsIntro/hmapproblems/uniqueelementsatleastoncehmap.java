import java.util.*;
class uniqueelementsatleastoncehmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i : arr) {
            hmap.put(i, hmap.getOrDefault(i, 0) + 1);
        }

        for(var i : hmap.entrySet()) {
            System.out.print(i.getKey() + " ");
        }
    }
}
/* n=5
 * input=4 3 3 2 1
 * output=4 3 2 1 (just printing keys of the map)
 */