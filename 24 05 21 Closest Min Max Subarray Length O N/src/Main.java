import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int[] A = new int [n];
        for (int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        int result = findClosestMaxMinSubarray(A);
        System.out.println(result);
    }
    public static int findClosestMaxMinSubarray(int[] A){
        int n = A.length;
        if (n ==0 ){return 0;}
        int maxVal = A[0];
        int minVal = A[0];
        for(int i = 0; i < A.length; i++){
            if (A[i] > maxVal){maxVal = A[i];}
            if(A[i] < minVal){minVal = A[i];}
        }

        if(maxVal == minVal){ return 1;}

        int lastMaxIndex = -1;
        int lastMinIndex = -1;
        int smallestLength = n+1;
        for(int i = 0; i < A.length; i++){
            if(A[i] == maxVal){
                lastMaxIndex = i;
                if(lastMinIndex != -1){
                    smallestLength = Math.min(smallestLength, lastMaxIndex - lastMinIndex +1);
                }
            }
            if(A[i] == minVal){
                lastMinIndex = i;

                if(lastMaxIndex != -1){
                    smallestLength = Math.min(smallestLength, lastMinIndex - lastMaxIndex +1);
                }
            }
        }
        return smallestLength;

    }

}