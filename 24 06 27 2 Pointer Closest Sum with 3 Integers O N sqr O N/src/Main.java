import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] a  = new int[n];
       for(int i = 0; i < n; i++){
           a[i] = sc.nextInt();
       }
       int k = sc.nextInt();
       int result = threeSum(a, k);
       System.out.print(result);
    }

    public static int threeSum(int[] a, int k){
        Arrays.sort(a);
        int n = a.length;
        int closestSum = a[0] + a[1] + a[2];
        for(int i = 0; i < n-2; i++){
            int l = i+1;
            int r = n -1;
            while(l < r){
                int sum = a[i] + a[l] + a[r];
                if(Math.abs(sum - k) < Math.abs(closestSum - k)){closestSum = sum;}
                if(sum < k){l++;}
                else if(sum > k){r--;}
                else{return sum;}
            }
        }
        return closestSum;
    }
}