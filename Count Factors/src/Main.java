import java.util.Scanner;
public class Main {
    public static void main (String[] args){
Scanner sc = new Scanner (System.in);
int A = sc.nextInt();

int countFactors = countFactor(A);
System.out.println(countFactors);
    }

    public static int countFactor(int A){
        int count =0;
        for (int i = 1; i <= A; i++){
            if (A%i == 0){
                count++;
            }
        }
        return count;
    }

}