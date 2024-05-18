import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i =0; i < A.length; i ++){
            A[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[][] B = new int[m][2];
        for (int i = 0; i < B.length; i++){
            B[i][0]= sc.nextInt();
            B[i][1]= sc.nextInt();
        }

        int[] result = rangeEven(A, B);

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] rangeEven(int[] A, int[][] B) {
        int n = A.length;
        int m = B.length;

        int[] evenPrefix = new int[n];
        if (A[0] % 2 == 0) {
            evenPrefix[0] = 1;
        } else {
            evenPrefix[0] = 0;
        }

        for (int i = 1; i < n; i++) {
            if (A[i] % 2 == 0) {
                evenPrefix[i] = evenPrefix[i - 1] + 1;
            } else {
                evenPrefix[i] = evenPrefix[i - 1];
            }
        }
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int l = B[i][0];
            int r = B[i][1];
            if (l == 0) {
                result[i] = evenPrefix[r];
            } else {
                result[i] = evenPrefix[r] - evenPrefix[l-1];
            }
        }

        return result;


    }
}
