public class Main {
    public static void main(String[] args){
int arr[] = {1,2,3,4,5};
int k = 3;
int n = arr.length;
kRotation (arr, n, k);
for (int i = 0; i<n; i++){
    System.out.print(arr[i] + " ");
}
    }

    public static void kRotation(int[] arr, int n, int k){
        k = k %n;
        if (k == 0){
            return;
        }
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void reverse (int[] arr, int l, int r){
        while (l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }



        }