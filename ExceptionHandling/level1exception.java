package ExceptionHandling;

import java.util.Scanner;

public class level1exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String deposit_input = sc.nextLine();
        String cost_input = sc.nextLine();
        try {
            double deposit = Double.parseDouble(deposit_input);
            if(deposit < 0)
                throw new IllegalArgumentException("Deposit cannot be negative: " + deposit);
            double cost = Double.parseDouble(cost_input);
            if(cost < 0)
                throw new IllegalArgumentException("Cost per day cannot be negative: " + cost);
            System.out.println(name + " " + deposit + " " + cost);
        } catch (NumberFormatException e) {
            if(e.getMessage().contains(deposit_input)) {
                System.out.println("java.lang.NumberFormatException: For input string: \"" + deposit_input + "\"");
            } else {
                System.out.println("java.lang.NumberFormatException: For input string: \"" + cost_input + "\"");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("java.lang.IllegalArgumentException: " + e.getMessage());
        }
    }
}

/* class Solution {
    public String getCharacterAtIndex(String str, int index) {
        try {
            return String.valueOf(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            return e.toString();
        }
    }
} */


