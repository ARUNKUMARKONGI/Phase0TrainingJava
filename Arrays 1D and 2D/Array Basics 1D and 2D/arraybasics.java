import java.util.*;
public class arraybasics {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] myNum = {10, 20, 30, 40}; //compile time initialization

        int arr[]=new int[10];
        //declaration of array runtime

        System.out.println(myNum.length);

        System.out.println(arr[5]);

        System.out.println(Arrays.toString(arr));
        //Arrays.toString converts array object into string object
        //helps to print all values at a time

        //by default array values are initialized to zero by the
        //compiler.

        String college="GRIET";

        //task: create one character array, store each character from the 
        //string into character array, and print them using either for loop
        //or using Arrays.toString.

        char [] a=college.toCharArray();
        System.out.println(Arrays.toString(a));

        char[]  ch = new char[college.length()];

      
        for(int i=0; i<college.length();i++)
        {
             ch[i]=college.charAt(i);
        }
        System.out.println(Arrays.toString(ch));


        //size of the array should be given as input
        //based on the size declare the array.

        int N=sc.nextInt();

        // int arr2[]=new int[N];

        //read N values from the user and store it in array

        // for(int i=0;i<N;i++){
        //     arr2[i]=sc.nextInt();
        // }

        /* System.out.println(Arrays.toString(arr2));

        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        //here i is the index of array value

        //enhanced loop

        for(int i:arr2){
            System.out.println(i);

            //i refers the actual value
        } */
    

         int arr3[]=new int[N];

         //size of array is 10 but read only 5 values and sum and print.

        //and also verify if input is integer only.
        int count=0;
        while(count<5 && sc.hasNextInt()){
            arr3[count]=sc.nextInt();
            count++;
        }
        int sum=0;
        for(int i:arr3)
        {
            sum+=i;
        }
        System.out.println("sum is: "+sum);
     
    }

    //2D arrays

}
