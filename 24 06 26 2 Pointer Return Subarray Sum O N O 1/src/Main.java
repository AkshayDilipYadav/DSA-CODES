import java.util.Scanner;

public class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];
for(int i = 0; i< n; i++){
    a[i] = sc.nextInt();
}
int k = sc.nextInt();
int[] result = returnSubarraySum(a, k);
for(int num : result){
    System.out.print(num + " ");
}
    }
    public static int[] returnSubarraySum(int[] a, int k){
        int l = 0;
        int r =0;
        int sum =0;
        while(r< a.length){
            sum += a[r];
            while(sum > k && l <= r){
                sum -= a[l];
                l++;
            }
            if(sum == k){
                int[] result = new int[r-l+1];
                System.arraycopy(a, l, result, 0, r-l+1);
                return result;
            }
            r++;
        }
        return new int[]{-1};
    }
}