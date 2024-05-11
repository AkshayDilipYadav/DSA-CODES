import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++){
            A[i]= sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.print(goodPair(A,B));
    }
    public static int goodPair(int[] A, int B){
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i< A.length; i++){
            int num = A[i];
            int complement = B - num;
            if (set.contains(complement)){return 1;}
            set.add(num);
        }
        return 0;
    }

}