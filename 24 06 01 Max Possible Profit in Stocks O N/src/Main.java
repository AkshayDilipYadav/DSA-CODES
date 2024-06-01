import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        int[] A = new int[n];

        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        int result = maxProfit(A);
        System.out.println(result);

    }

    public static int maxProfit(int[] A){
        if(A == null || A.length <= 1){return 0;}
        int minPrice = A[0];
        int maxProfit = 0;

        for(int i = 1; i < A.length; i++){
            int profit = A[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, A[i]);
        }
        return maxProfit;
    }

}