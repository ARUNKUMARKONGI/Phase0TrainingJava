package StringBasics;

public class trimMethod {
    public static void main(String[] args) {
        String myStr = "       Hello World!        ";
        System.out.println(myStr);
        System.out.println(myStr.trim());

        String str1="  griet";
        String str2 = "griet   ";
//
        if(str1.trim().length()!=str2.trim().length())
        {
            System.out.println("strings are not same");
        }
        else
            System.out.println("Strings are same");
    }
}