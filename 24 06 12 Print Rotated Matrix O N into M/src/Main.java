import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i =0; i< n; i++){
            for(int j =0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int[][] rotated = rotatedMatrix(a);

        for(int i =0; i<rotated.length; i++){
            for(int j = 0; j < rotated[0].length; j++){
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static int[][] rotatedMatrix(int[][] a){
        int n = a.length;
        int m = a[0].length;
        int[][] rotated = new int[m][n];
        for(int i =0; i <n; i++){
            for(int j =0; j < m; j++){
                rotated[j][n-1-i] = a[i][j];
            }
        }
        return rotated;

    }

}