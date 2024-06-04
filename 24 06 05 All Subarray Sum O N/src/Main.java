import java.util.Scanner;
public class Main{
    public static void main(String[]args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n; i++){
            a[i] = sc.nextInt();
        }
        int result  = sumOfAllSubarray(a);
        System.out.println(result);
    }

    public static int sumOfAllSubarray(int[] a){
        int n = a.length;
        int  subarraySum = 0;
        for(int i = 0; i < n; i++){

            subarraySum +=  a[i] * ((i+1)*(n-i));
        }
        return subarraySum;
    }

}