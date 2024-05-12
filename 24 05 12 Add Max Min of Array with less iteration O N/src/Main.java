import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
       System.out.print( addMaxMin(A));

    }

    public static int addMaxMin(int[] A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
for (int i = 0; i < A.length -1; i = i +2){
        if (A[i] > A[i + 1]) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[i + 1]);
        } else {
            max = Math.max(max, A[i + 1]);
            min = Math.min(min, A[i]);

        }

    }

if (A.length % 2 != 0){
    max= Math.max(max, A[A.length -1]);
    min= Math.min(min, A[A.length -1]);
}

return max + min;

    }


}