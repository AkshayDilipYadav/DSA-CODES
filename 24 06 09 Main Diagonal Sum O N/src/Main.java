import java.util.Scanner;
public class Main {
    public static void main (String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int m = sc.nextInt();
     int[][] a = new int[n][m];
     for(int i = 0; i < n; i++){
         for(int j =0; j< m; j++){
            a[i][j] = sc.nextInt();
         }
     }
     int result = diagonalSum(a);

         System.out.print(result+" ");

    }
    public static int diagonalSum(int[][] a){
        int n = a.length;
        int sum = 0;
        for(int i =0; i< n; i++){
            sum += a[i][i];
        }
        return sum;
    }
}
