import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i =0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.print(equality(A));

    }

    public static int equality(int[] A){
        int max =0;
        int totalIncrement = 0;
        for (int i = 0; i < A.length; i++){
            if(A[i] > max){max = A[i];}
        }

        for (int i = 0; i < A.length; i++){
            totalIncrement += max - A[i];
        }

        return totalIncrement;

    }
}