import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double A = sc.nextInt();
        double R = sc.nextInt();
        int N = sc.nextInt();
        double sum = sumOfGeometricProgression(A, R, N);
        System.out.println(sum);
    }
    public static double sumOfGeometricProgression(double A, double R, int N){
        return A*((Math.pow(R, N)-1)/(R-1));
    }
}