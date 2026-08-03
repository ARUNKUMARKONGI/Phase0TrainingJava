package ProblemsOnStrings;

public class firstandlastindexofsubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String text = s.nextLine();
        String pat = s.nextLine();
        int first = text.indexOf(pat);
        int last = text.lastIndexOf(pat);
        System.out.print(first + " " + last);
    }
}
