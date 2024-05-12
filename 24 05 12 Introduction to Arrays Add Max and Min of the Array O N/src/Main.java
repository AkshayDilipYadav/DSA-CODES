import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        System.out.println(addMaxMin(A));
    }

    public static int addMaxMin(int[] A ){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < A.length; i++ ){
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i]);
        }
        return max + min;
    }
}