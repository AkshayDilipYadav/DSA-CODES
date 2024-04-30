import java.util.Scanner;
public class Main {
    public static void main (String[] args){
Scanner sc = new Scanner (System.in);
int A = sc.nextInt();



int[] result = countFactor(A);
int count = result[0];
int runs = result[1];
        System.out.println( "Runs:"+runs);
System.out.println(count);

    }

    public static int[] countFactor(int A){
        int[] result = new int[2];

        int runs=0;
        int count =0;
        for (int i = 1; i <= A; i++){
            if (A%i == 0){
                count++;
            }
            runs++;
        }
        result[0] = count;
        result[1] = runs;
        return result;
    }

}