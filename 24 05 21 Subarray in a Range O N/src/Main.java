import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] subarray = getSubarray(A,B,C);
        for (int i =0; i < subarray.length; i++){
            System.out.print(subarray[i]+" ");
        }
    }

    public static int[] getSubarray(int[] A, int B, int C){
        int length = C-B+1;
        int[] subarray = new int[length];
        for(int i =0; i < length; i++){
            subarray[i] = A[B+i];
        }
        return subarray;
    }
}