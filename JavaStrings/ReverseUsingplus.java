package StringBasics;

public class ReverseUsingplus {
    public static void main(String[] args) {
        String str1 = "GRIET";
        String res = "";
        System.out.println("Original string: " + str1);

        for (int i = 0; i < str1.length(); i++) {
            res = str1.charAt(i) + res;
        }

        System.out.println("Reversed string: "+ res);
    }
}


//use prepending operation, first G then RG, IRG.. and so on