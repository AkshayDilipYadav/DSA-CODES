import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
       System.out.print( goodPair(A, B));
    }
    public static int goodPair (int[] A, int B){
        int l = 0;
        int r = A.length -1;

        while (l<r){
            int sum = A[l]+A[r];
            if (sum == B){
                return 1;

            }
            else if (sum < B){l++;}
            else {r--;}
        }
        return 0;
    }
}