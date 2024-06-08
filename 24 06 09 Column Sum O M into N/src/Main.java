import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int [n][m];
        for(int i = 0; i< n; i++){
            for(int j =0; j< m; j++){
                a[i][j] = sc.nextInt();
            }

        }
        int[] result = columnSum(a);
        for(int i =0; i< result.length; i++){ System.out.print(result[i] + " ");}
    }
    public static int[] columnSum(int[][] a){
        int  n= a.length;
        int m = a[0].length;
        int[] sums = new int [m];
        for(int j = 0; j< m; j++){
            int sum =0;
            for(int i =0; i < n; i++ ){sum += a[i][j];}
            sums[j]= sum;
        }
        return sums;
    }
}