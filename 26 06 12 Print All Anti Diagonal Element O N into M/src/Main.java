import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        printAntidiagonals( a);


    }
    public static void printAntidiagonals(int[][] a){
        int n = a.length;
        int m = a[0].length;

        for(int j=0;j<m;j++){
            int r = 0;
            int c =j;
            while (r<n && c >=0){
                System.out.print(a[r][c]+" ");
                r++;
                c--;
            }
            System.out.println();
        }

        for(int i =1; i < n; i++){
            int r =i;
            int c =m-1;
            while (r<n && c>=0){
                System.out.print(a[r][c]+" ");
                r++;
                c--;
            }
            System.out.println();
        }

    }

}