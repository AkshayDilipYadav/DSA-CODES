import java.util.Scanner;
public class Main{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] a = new int[n];
for(int i = 0; i < n; i++){
    a[i] = sc.nextInt();
}
int b = sc.nextInt();
int result = subarraySum(a, b);
System.out.print(result);
    }

    public static int subarraySum(int[]a, int b){
        int n = a.length;
        int count = 0;
        for(int i =0; i < n ; i++){
            int sum =0;
            for(int j = i; j <n; j++){
               sum += a[j];
               if((j-i+1)%2==0 && sum < b){count++;}
               else if((j-i+1)%2 == 1 && sum> b){count++;}
            }
        }
        return count;
    }
}