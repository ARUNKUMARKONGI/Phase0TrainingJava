package CollectionsBasicsIntro.hmapproblems;
import java.util.HashMap;
import java.util.Scanner;

public class AnagramUsingHashMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine().replaceAll(" ", "").toLowerCase();
        String s2 = scanner.nextLine().replaceAll(" ", "").toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("false");
            return;
        }

        HashMap<Character, Integer> hmap = new HashMap<>();

        for (char ch : s1.toCharArray()) 
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);

        for (char ch : s2.toCharArray()) 
            hmap.put(ch, hmap.getOrDefault(ch, 0) - 1);

        boolean flag = true;

        for (var pair : hmap.entrySet()) {
            if (pair.getValue() != 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("strings are anagarams");
        } else {
            System.out.println("strings are not anagrams");
        }
    }
}
