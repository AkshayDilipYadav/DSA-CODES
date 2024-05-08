public class Main {
    public static void main (String[] args){
        int A[] = {1,2,3,4,5};
        int k = 3;
        int n = A.length;
        for (int i = 0; i < k; i++){
            int temp= A[n-1] ;
            for (int j = n-1; j >=1; j--){
                A[j] = A[j -1];
            }
            A[0] = temp;
        }
        for (int i = 0; i < n; i++){
            System.out.print(A[i] + " ");
        }
    }
}