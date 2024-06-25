import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.print(checkDiff(a, k));

    }
    public static boolean checkDiff(int[] a, int k){
        int n = a.length;
        int l =0, r = 1;

        while(r<n){
            int diff = a[r] - a[l];
            if(l != r && diff == k){return true;}
            else if(diff < k){r++;}
            else{l++;}
            if(l == r){r++;}
        }
        return false;
    }
}