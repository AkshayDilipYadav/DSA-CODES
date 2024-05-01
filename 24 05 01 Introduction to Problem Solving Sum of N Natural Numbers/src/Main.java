import java.util.Scanner;

public class Main {
    public static void main (String[] args){
      Scanner sc = new Scanner (System.in);
      int A = sc.nextInt();

      int sum = sumNNumbers(A);
      System.out.println(sum);
    }
    public static int sumNNumbers(int A){
        return (A*(A+1))/2;
    }
}