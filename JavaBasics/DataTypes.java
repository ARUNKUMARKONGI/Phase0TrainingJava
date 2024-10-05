class DataTypes {
    public static void main(String[] args) {
        long exampleLong = 123456789012345678L;
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        int sizeInBytes = Integer.BYTES;
        System.out.println("Size of Integer in bytes: " + sizeInBytes);

        int widthInBits = Long.SIZE;
        System.out.println("Width of long in bits: " + widthInBits);

        System.out.println("Example long value: " + exampleLong);


                char a = 'z';
                char b = '1';
                char c = '@';

                System.out.println(Character.getNumericValue(a));  //returns default unicode value 10+the alphabet count order
                System.out.println(Character.getNumericValue(b));  //returns integer value
                System.out.println(Character.getNumericValue(c));  //for special chars -1

                b++;
                System.out.print((int)b); //ascii value of 1 50
                System.out.println("arun");
        }
    }

