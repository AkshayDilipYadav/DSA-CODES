import java.util.Scanner;

public class Main {
    public static void main(String[] args){
Scanner sc = new Scanner (System.in);
    int A = sc.nextInt();
    int countFactors = countFactor(A);
    System.out.println(countFactors);
}

public static int countFactor(int A){
        if (A == 1){
            return 1;
        }
      int count =0;

        int sqrtA = (int) Math.sqrt(A);

        for (int i = 1; i <= sqrtA; i++){
            if (A % i == 0){count+= 2;}
        }
        if (sqrtA * sqrtA == A){count -= 1;}
        return count++;
}
}