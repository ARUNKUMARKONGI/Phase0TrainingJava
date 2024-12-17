package LoopsBitManipulationNumberBasedProblems;


public class ContainsAllAlphabetsBitManipulation {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        int bitmask = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                bitmask |= (1 << (c - 'a'));
            }
        }

        if (bitmask == (1 << 26) - 1) {
            System.out.println("The string contains all alphabets.");
        } else {
            System.out.println("The string does not contain all alphabets.");
        }
    }
}

