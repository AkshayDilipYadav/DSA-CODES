import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.print(equilibriumIndex(A));
    }

    public static int equilibriumIndex(int[] A){
        int n = A.length;
        if (n == 0){return -1;}

        int totalSum = 0;
        for (int i = 0; i< n; i++){
            totalSum += A[i];
        }

        int leftSum =0;
        for(int i =0; i < n; i++){
            int rightSum = totalSum - leftSum - A[i];
            if (leftSum == rightSum){return i;}
            leftSum += A[i];
        }
        return -1;



    }

}