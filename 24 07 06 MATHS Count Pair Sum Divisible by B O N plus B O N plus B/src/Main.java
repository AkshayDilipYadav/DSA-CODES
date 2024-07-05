import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i< n; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int result = countPairSum(A, B);
        System.out.print(result);
    }
    public static int countPairSum(int[] A, int B) {
        long MOD = 1000000007;
        int n = A.length;
        long[] remainderCount = new long[B];
        // step 1: Calculate remainders
        for(int i = 0; i< n; i++){
            int remainder = A[i]%B;
            remainderCount[remainder]++;
        }
        // step 2: Calculate remainder pairs
        long result = 0;
//Case 1: Pairs with remainders that are same
        result += (remainderCount[0] * (remainderCount[0] - 1))/2;
        result %= MOD;
        // case 2: Pairs with Complementary remainder
        for(int i = 1; i <= B/2; i++){
            if(i != B-i){
                result += remainderCount[i] * remainderCount[B-i];
                result %= MOD;
            }
        }
        // Edge Case: When B is even, handle the middle value
        if(B%2 == 0){
            result += (remainderCount[B/2] * (remainderCount[B/2] - 1))/2;
            result %= MOD;
        }
        return (int) result;
    }
}