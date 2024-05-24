import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int result = countUniqueSubarrays(A);
        System.out.print(result);
    }
    public static int countUniqueSubarrays(int[] A){
        int MOD = 1000000007;
        int n = A.length;
        int l = 0;
        long count =0;
        int[] lastLoc = new int[1000001];

        for(int i =0; i < lastLoc.length; i++){
            lastLoc[i] = -1;
        }

        for (int r = 0; r < n; r++){
            if (lastLoc[A[r]] >= l){
                l = lastLoc[A[r]] +1;
            }

            lastLoc[A[r]] = r;
            count = (count +(r - l + 1))% MOD;
        }
        return (int) count;
    }
}