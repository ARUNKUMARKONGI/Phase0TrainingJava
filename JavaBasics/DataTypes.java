class DataTypes {
    public static void main(String[] args) {
        long exampleLong = 123456789012345678L;
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        // char c = sc.next().charAt(0);
        boolean myBool = true;
        // convert double to float
        float convertedFloat = (float) myDoubleNum;
    
        String myText = "Hello";
        int sizeInBytes = Integer.BYTES;
        System.out.print ln("Size of Integer in bytes: " + sizeInBytes);

        int widthInBits = Long.BYTES;
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

                // But if both operands are integers, Java performs integer division (truncates).


/* int a = 10;
int b = 3;
int result = a / b;     // 3 (not 3.333...)
double wrong = a / b;   // still 3.0, because a/b is int before conversion
double right = a / 3.0; // 3.333...

long sum=0;
long sum = sum + Math.pow(3,5) (3^5)
 this will give compiler error bcz pow always returns double
 
 sum += Math.pow(3,5) this will not give error bcz += operator
 automatically does implicit type casting */
        }
    }

