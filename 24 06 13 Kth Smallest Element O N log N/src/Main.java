import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] a  = new int[n];
     for(int i = 0; i< n; i++){
         a[i] = sc.nextInt();
     }
     int b = sc.nextInt();
     int result = kthSmallest(a, b);
     System.out.print(result);
    }
    public static int kthSmallest(int[] a, int b){
        Arrays.sort(a);
        return a[b-1];
    }
}