import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int[] result = rowSum(a);
        for(int i = 0 ; i < result.length; i++){  System.out.println(result[i]);}


    }
    public static int[] rowSum(int[][] a){
        int n = a.length;
        int m = a[0].length;
        int[] sums = new int [n];
        for(int i = 0; i< n;i++ ){
            int sum =0;

            for(int j =0; j< m; j++){
                sum += a[i][j];
            }
            sums[i]=sum;
        }
        return sums;
    }
}