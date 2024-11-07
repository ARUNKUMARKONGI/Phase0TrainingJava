package SIProblems;
import java.util.*;
public class mergesorted {
   
    
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
           int[] arr=new int[n];
          
            for(int i=0;i<n;i++){
                
                arr[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            int[] arr1=new int[m];
            for(int i=0;i<m;i++){
                arr1[i]=sc.nextInt();
            }
            int[] arr2=new int[n+m];
    
            for(int i=0;i<n;i++){
                arr2[i]=arr[i];
            }
            for(int i=0;i<m;i++){
                arr2[n+i]=arr1[i];
            }
            Arrays.sort(arr2);
            for(int i=0;i<n+m;i++){
                System.out.print(arr2[i]+" ");
            }
            System.out.println();
    
        }
    } 

