import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i< n; i++){
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if(hasPairSum(a, k)){System.out.print("True");}
        else{System.out.print("True");}
    }
    public static boolean hasPairSum(int[] a, int k){
        int left = 0;
        int right = a.length -1;
        while(left< right){
           int sum = a[left ] + a[right];
           if(sum == k){return true;}
           else if(sum < k){left ++;
           }
           else {right--;}

        }
        return false;
    }
}