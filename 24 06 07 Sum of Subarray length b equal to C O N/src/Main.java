import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = subarrayLengthSum(a, b, c);
        System.out.print(result);
    }
    public static int subarrayLengthSum(int[] a , int b, int c){
        int n = a.length;
        if (b>n){return 0;}
        int currentSum = 0;
        for(int i = 0; i < b; i++){
            currentSum += a[i];
        }
        if (currentSum == c){
            return 1;
        }
        for(int i = b; i < n; i++){
            currentSum += a[i] - a[i-b];
            if(currentSum == c){
                return 1;
            }
        }
        return 0;
    }
}