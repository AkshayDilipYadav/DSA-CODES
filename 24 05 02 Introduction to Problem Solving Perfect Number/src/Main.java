import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
if (perfectNumber(A) == 1){System.out.println("is Perfect Number");}
else {System.out.println("is not Perfect Number");}
    }

    public static int perfectNumber(int A){
        if (A <= 1){return 0;}
        int sum = 1;
        int sqrtA = (int)Math.sqrt(A);
        for (int i = 2; i <=sqrtA; i++){
            if (A%i == 0){sum = sum + i + (A/i);}
        }
        if (sum == A){return 1;}
        else{return 0;}
    }
}