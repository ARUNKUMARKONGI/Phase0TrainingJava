public class bitmask1 {
    public static void main(String[] args) {
    
    int n=10;
    int mask= 1<<2; //mask for 3rd bit(0,1,2) 1<<n in general
    n=n|mask;       //n=n&(~)mask will unset the bit
    System.out.println(n);
}
}
//1010 in binary, 3rd bit is 0, after setting it,
//it becomes 1110 so output is 14
// given an integer num, set the 'nth' bit from the num.
