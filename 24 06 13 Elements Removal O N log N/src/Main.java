import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a= new int[n];
        for(int i =0; i< n; i++){
            a[i] = sc.nextInt();
        }
    int result = elementRemoval(a);
        System.out.print(result);
    }
    public static int elementRemoval(int[] a){
        int n = a.length;
        Arrays.sort(a);
        int totalCost = 0;
        for(int i = 0; i<n; i++){
            totalCost += a[i]* (n-i);
        }
        return totalCost;
    }

}