import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(countDiff(a, k));

    }
    public static int countDiff(int[] a, int k){
        Arrays.sort(a);
        int l =0;
        int r = 1;
        int count = 0;
        while(r < a.length){
            int diff = a[r] - a[l];
            if(diff < k){r++;}
            else if(diff > k){l++;}
            else {
                count++;
                int lValue = a[l];
                while(l < a.length && a[l] == lValue){l++;}
                int rValue = a[r];
                while(r< a.length && a[r] == rValue){r++;}
            }
            if(l == r){r++;}
        }
        return count;
    }
}