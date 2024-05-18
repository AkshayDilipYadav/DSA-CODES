import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i=0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] B = new int[m][2];
        for (int i = 0; i < m; i++){
            B[i][0] = sc.nextInt();
            B[i][1] = sc.nextInt();
        }
        int[] result = rangeSum(A, B);

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] rangeSum(int[] A, int[][] B){
        int n = A.length;
        int m = B.length;

        long[] prefixSum = new long[n];

        prefixSum[0] = A[0];
        for (int i =1; i < n; i++){
            prefixSum[i] = prefixSum[i-1] + A[i];
        }
        int[] result = new int[m];

        for (int i =0; i < m; i++){
            int l = B[i][0];
            int r = B[i][1];
            if (l ==0){ result[i] = (int)prefixSum[r];}
            else{result[i] = (int)(prefixSum[r] - prefixSum[l-1]);}


        }
        return result;
    }

}