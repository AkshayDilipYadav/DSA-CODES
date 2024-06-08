import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i< n; i++ ){
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int result = subarraySum(a, b);
        System.out.print(result);
    }
    public static int subarraySum(int[] a, int b){
        int n = a.length;
        int count = 0;
        int sum =0;
        int start = 0;
        for(int end =0; end < n; end++){
            sum += a[end];
            while (sum >=b && start <=end){
sum -= a[start];
start++;
            }
            count += (end - start +1);
        }

        return count;

    }
}