package Arrays1D2DProblems.Arrays1D;
import java.util.*;
public class maxonesrow {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int i = 0;
        int j = m - 1;

        int ans = -1;

        while(i < n && j >= 0)
        {
            if(arr[i][j] == 1)
            {
                ans = i;
                j--;
            }
            else
            {
                i++;
            }
        }

        System.out.println(ans);
    }
}


/* brute force

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int max_count = 0;
        int ans = -1;

        for(int i = 0; i < n; i++)
        {
            int count = 0;

            for(int j = 0; j < m; j++)
            {
                if(arr[i][j] == 1)
                {
                    count++;
                }
            }

            if(count > max_count)
            {
                max_count = count;
                ans = i;
            }
        }

        System.out.println(ans);
    }
}*/