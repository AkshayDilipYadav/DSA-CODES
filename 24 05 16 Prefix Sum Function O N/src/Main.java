import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++){A[i]=sc.nextInt();}
        int[] prefixSum = computePrefix(A);

        for (int i =0; i < prefixSum.length; i++){System.out.print(prefixSum[i] + " ");}
    }

    public static int[] computePrefix(int[] A){
        int[] pSum = new int[A.length];
        pSum[0] = A[0];
        for (int i = 1; i < A.length; i++){
            pSum[i] =pSum[i-1]+ A[i];
        }
        return pSum;
    }
}