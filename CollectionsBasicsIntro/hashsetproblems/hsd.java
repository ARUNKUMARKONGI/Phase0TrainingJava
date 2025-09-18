import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (char c : str1.toCharArray()) set1.add(c);
        for (char c : str2.toCharArray()) set2.add(c);

        LinkedHashSet<Character> result = new LinkedHashSet<>();

        for (char c : str1.toCharArray()) {
            if (!set2.contains(c)) result.add(c);
        }
        for (char c : str2.toCharArray()) {
            if (!set1.contains(c)) result.add(c);
        }

        for (char c : result) {
            System.out.print(c);
        }
    }
}

/* Sample Input=
Hello World!
Goodbye World!
 Sample Output=
HGby
 Sample Input=
12 34 56
5264
 Sample Output=
1 3 */