import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];
for(int i = 0; i< n; i++){
    a[i] = sc.nextInt();
}
int result = nobleElement(a);
System.out.print(result);
    }
    public static int nobleElement(int[] a ){
        int n = a.length;
        Arrays.sort(a);
        for(int i = 0; i<n; i++){
            if(a[i] == n - i -1 ){
                if(i == n-1 || a[i] != a[i+1]){return 1;}
            }
        }
        return -1;
    }
}