import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc  = new Scanner (System.in);
        int A = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= A; i++){
            if (countPrime(i)){count++;}
        }
System.out.println(count);
    }
    public static boolean countPrime(int A){
        for (int i = 2; i <= Math.sqrt(A); i++){
            if (A%i == 0){return false;}
        }
        return true;
    }
}