import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        System.out.print(secondLargeElement(A));
    }

    public static int secondLargeElement (int[] A){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++){
            if (A[i] > largest){secondLargest = largest; largest = A[i];}
            else if(A[i] > secondLargest && A[i] != largest){secondLargest = A[i];}
        }
        if(secondLargest == Integer.MIN_VALUE){return -1;}
        return secondLargest;
    }
}