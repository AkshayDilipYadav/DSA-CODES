import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int result = maxArea(a);
        System.out.print(result);
    }

    public static int maxArea(int[] a){
        if(a == null || a.length < 2){return 0;}
        int maxArea = 0;
        int l = 0;
        int r = a.length -1;

        while(l < r){
            int width = r - l;
            int minHeight = Math.min(a[l], a[r]);
            int currentArea = width * minHeight;
            maxArea = Math.max(maxArea, currentArea);
            if(a[l] < a[r]){l++;}
            else{r--;}
        }
        return maxArea;

    }

}