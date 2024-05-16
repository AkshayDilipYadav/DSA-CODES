import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++){A[i]=sc.nextInt();}
        int prefixSum =0;
        for (int i = 0; i < A.length; i++){ prefixSum += A[i]; System.out.print(prefixSum + " ");}
    }
}