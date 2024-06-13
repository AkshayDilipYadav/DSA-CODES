import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a  = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int result = ifAP(a);
        System.out.print(result);
    }
    public static int ifAP(int[] a){
        int n = a.length;
        Arrays.sort(a);
        int commonDiff = a[1]-a[0];
        for(int i =2; i < n; i++){
            if(a[i] - a[i-1] != commonDiff){
                return 0;
            }
        }
        return 1;
    }
}