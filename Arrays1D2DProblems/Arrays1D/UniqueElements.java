import java.util.Scanner;

public class UniqueElements {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = scanner.nextInt();
            }
            findAndPrintUniqueElements(array, N);
        }

        private static void findAndPrintUniqueElements(int[] array, int N) {
            boolean[] visited = new boolean[N];

            for (int i = 0; i < N; i++) {
                if (visited[i]==false) {
                    System.out.print(array[i] + " ");
                    for (int j = i + 1; j < N; j++) {
                        if (array[i] == array[j]) {
                            visited[j] = true;
                        }
                    }
                }
            }
        }
    }

   /*  private static void findAndPrintUniqueElements(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> duplicateElements = new HashSet<>();

        for (int num : array) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        uniqueElements.removeAll(duplicateElements);

        System.out.println("Unique elements:");
        for (int unique : uniqueElements) {
            System.out.print(unique + " ");
        }
    } */





/*
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        */
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. *//*

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            if(map.containsKey(x)) map.put(x, map.get(x)+1);
            else map.put(x,1);
        }

        for(int x : map.keySet()){
            if(map.get(x) == 1) System.out.print(x+" ");
        }
    }
}*/
