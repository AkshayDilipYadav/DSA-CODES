import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int count = countPairSum(a, k);
        System.out.print(count);
    }
    public static int countPairSum(int[] a, int k){
        int l = 0;
        int r = a.length -1;
        int count =0;
        while(l< r){
            int sum = a[l]+ a[r];
            if(sum == k){
                count++;
                l++;
                r--;
            }
            else if(sum < k){l++;}
            else{r--;}

        }
        return count;
    }
}