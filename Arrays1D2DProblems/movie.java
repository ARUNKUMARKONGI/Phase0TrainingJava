import java.util.*;

class MovieCollisionsBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //movies
        int m = sc.nextInt(); //days
        int[][] schedule = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                schedule[i][j]=sc.nextInt();
            }
        }
        
        int collisions=0;
        for(int day=0; day<m; day++){
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(schedule[i][day]==1 && schedule[j][day]==1){
                        collisions++;
                    }
                }
            }
        }
        
        System.out.println(collisions);
    }
}
/* 
 * 
 * import java.util.*;

class MovieCollisions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] schedule = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                schedule[i][j]=sc.nextInt();
            }
        }
        
        int res=0;
        for(int j=0;j<m;j++){
            int count=0;
            for(int i=0;i<n;i++){
                if(schedule[i][j]==1){
                    count++;
                }
            }
            if(count>1){
                res+=(count*(count-1))/2;
            }
        }
        
        System.out.println(res);
    }
}
Movie    Day1 Day2 Day3
1        1    1    1
2        1    0    1
3        1    1    1
4        1    0    0
Expected Output:
10
 */