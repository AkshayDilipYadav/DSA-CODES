import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(hasSubarraySum(a, k)){System.out.print(true);}
        else{System.out.print(false);}
    }
    public static boolean hasSubarraySum (int[] a, int k){
        int l =0;
        int r = 0;
        int sum =0;
        while(r<a.length){
            sum += a[r];
            while(sum > k && l <= r){
                sum -= a[l];
                l++;
            }
            if(sum == k){
                return true;
            }
            r++;
        }
        return false;
    }
}