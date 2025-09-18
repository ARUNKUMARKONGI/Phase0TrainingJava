import java.util.*;
class twoarray {
    public static void main(String[] args) {

        //run time 
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();

        int r2=sc.nextInt();
        int c2=sc.nextInt();

        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];

        if(c1!=r2)
        {
            System.out.println("mult not possible");
            return;
        }
        //read values from user

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        //multiply
        int c[][]=new int[r1][c2];

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
            {
                for(int k=0;k<c1;k++)
                {
                    c[i][j]=c[i][j]+a[i][k]*b[k][j];
                }
            }
        }

        //enhanced loop
        for(int college[]:c)
        {
            for(int j:college)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}