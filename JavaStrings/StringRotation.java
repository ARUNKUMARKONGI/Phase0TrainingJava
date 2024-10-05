package StringBasics;
import java.util.Scanner;
public class StringRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String goal = scanner.next();
        boolean result = canShiftToGoal(s, goal);
        System.out.println(result);
    }
    private static boolean canShiftToGoal(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        // Concatenate s with itself to handle circular shifts
        String res = s + s;
        // Check if goal is a substring of res
        return res.contains(goal);
    }
}

