import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();

        }
        int b = sc.nextInt();
        int result = maxSum (a, b);
        System.out.println(result);
    }

    public static int maxSum(int[] a, int b){
        int n = a.length;
        int Sum = Integer.MIN_VALUE;
        int prefixSum = 0;
        int suffixSum = 0;

        for (int i =0; i < b; i++){
            prefixSum += a[i];
        }
        Sum = Math.max(Sum, prefixSum);

        for (int i =1; i<= b; i++){
            prefixSum -= a[b-i];
            suffixSum += a[n-i];

            int currentSum = prefixSum + suffixSum;
            Sum = Math.max(Sum, currentSum);

        }

        return Sum;
    }

}