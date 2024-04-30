import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A  = sc.nextInt();
        boolean isPrime = isPrime(A);
        if (isPrime){System.out.println("is Prime");}
        else {System.out.println("is not a Prime");}
    }

    public static boolean isPrime(int A){
        if (A <= 1){return false;}
        int sqrtA = (int)Math.sqrt(A);
        for (int i =2; i <= sqrtA; i++){
            if (A % i == 0){
                return false;
            }
        }
        return true;
    }
}