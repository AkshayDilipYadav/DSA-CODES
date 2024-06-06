import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){a[i] = sc.nextInt();}
        int b = sc.nextInt();
        int result = maxSumSubarray(a, b, n);
        System.out.println(result);
    }

    public static int maxSumSubarray(int[] a, int b, int n){
        int currentSum = 0;
        int maxSum = 0;
        int start =0;
        for(int end =0; end< n; end++){
            currentSum += a[end];
            while(currentSum > b){currentSum -= a[start++];}
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}