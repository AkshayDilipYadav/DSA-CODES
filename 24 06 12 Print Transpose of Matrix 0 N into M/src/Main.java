import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
int[][] a = new int[n][m];
for(int i = 0; i< n; i++){
    for(int j =0; j< m; j++){
        a[i][j] =sc.nextInt();
    }
}
int[][] transpose = solve(a);
for(int i =0; i< m; i++){
    for(int j =0; j<n; j++){
        System.out.print(transpose[i][j] + " ");
    }
    System.out.println();
}
    }

    public static int[][] solve(int[][] a){
        int n = a.length;
        int m = a[0].length;

        int[][] transpose = new int[m][n];
        for(int i =0; i<n;i++){
            for(int j =0; j<m; j++){
                transpose[j][i] = a[i][j];
            }

        }
        return transpose;
    }

}