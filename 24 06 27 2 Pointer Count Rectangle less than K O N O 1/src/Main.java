import java.util.Scanner;
public class Main{
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result = lessRectangleCount(a, k);
        System.out.print(result);
    }
    public static int lessRectangleCount(int[] a, int k){
        final int MOD = 1000000007;
        int n = a.length;
        int i =0;
        int j = n-1;
        long count = 0;
        while(i <= j){
            if((long) a[i] * a[j] < k){
                count = (count + (j-i+1)*2-1)%MOD;
                i++;
            }
            else{j--;}
        }
        return (int) count;
    }
}