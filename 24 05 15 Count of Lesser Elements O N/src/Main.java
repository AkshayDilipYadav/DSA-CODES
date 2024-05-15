import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A= new int[N];

        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.print(countLesserElement(A));
    }

    public static int countLesserElement(int[] A){
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++){
            if (A[i]> max){max = Math.max(max, A[i]);}
        }
        for (int i = 0; i < A.length; i++){
            if(A[i] < max){count++;}
        }
        return count;
    }
}