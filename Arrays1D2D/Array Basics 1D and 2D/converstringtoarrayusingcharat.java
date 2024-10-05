public class Main {
    public static void main(String[] args) {
        String myStr = "Hello";
        char[] myArray = new char[myStr.length()];

        for (int i = 0; i < myStr.length(); i++) {
            myArray[i] = myStr.charAt(i);
        }

        // Optional: Print the new array to verify
        System.out.println(myArray);
    }
}
