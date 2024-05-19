import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int  i =0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int[][] subarray = allSubarray(A);

        for (int i= 0; i < subarray.length; i++){
            int[] array = subarray[i];
            for (int j = 0; j < array.length; j++){
                System.out.print(array[j]+ " ");
            }
            System.out.println();

        }


    }

    public static int[][] allSubarray(int[] A){
        int n = A.length;
        int totalSubarray = n*(n+1)/2;
        int[][] result = new int[totalSubarray][];

        int index =0;
        for (int start =0; start < n; start++) {
            for (int end = start; end < n; end++) {
                int[] subarray = new int[end - start + 1];

                for (int k = start; k <= end; k++) {
                    subarray[k - start] = A[k];
                }
                result[index++] = subarray;
            }
        }
        return result;
    }



}