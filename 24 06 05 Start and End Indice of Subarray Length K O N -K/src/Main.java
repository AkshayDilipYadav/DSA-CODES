import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        startEndIndice(a, k);
    }
    public static void startEndIndice(int[] a , int k){
        int n = a.length;
        for(int s = 0; s<=n-k; s++){
            int e = k+s-1;
            System.out.println(s+ " " + e);
        }
    }
}