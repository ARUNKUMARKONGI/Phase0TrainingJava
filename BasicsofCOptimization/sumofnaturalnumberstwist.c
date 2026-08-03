import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum;
if(n%2==0)
sum=(n/2)*(n+1);
else
sum=n*((n+1)/2);
System.out.println(sum);
}
}

//to ensure output stays within integer limits, we can use long long int in C or long in Java. The above code is in Java, and it calculates the sum of the first n natural numbers using the formula n(n+1)/2, which is efficient and runs in constant time O(1).