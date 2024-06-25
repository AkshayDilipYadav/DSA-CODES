import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(countPairs(a, k));

    }

    public static int countPairs(int[] a, int k){
        int n = a.length;
        int l = 0;
        int r = n -1;
        long count = 0;
        int MOD = 1000000007;
        while(l < r){
            long sum = (long) a[l] + a[r];
            if(sum == k){
                if(a[l] == a[r]){
                    long totalElements = r - l +1;
                    count +=(totalElements*(totalElements - 1))/2;
                    count %= MOD;
                    break;
                }
                int lCount = 1, rCount = 1;
                while(l+1 < r && a[l] == a[l+1]){
                    lCount++;
                    l++;
                }
                while(r - 1 < r && a[r] == a[r-1]){
                    rCount++;
                    r--;
                }
                count += (long) lCount * rCount;
                count %= MOD;
                l++;
                r--;
            }
            else if(sum < k){l++;}
            else{r--;}
        }
        return (int) count;
    }
}