import java.util.Scanner;
import java.util.Stack;
class NearestSmallerElement{
    public static int[] findNearestSmallerElements(int[] A){
        int n = A.length;
        int[] G = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && A[stack.peek()] >= A[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                G[i] = -1;
            }
            else{
                G[i] = A[stack.peek()];
            }
            stack.push(i);
        }
        return G;
        }

    public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] A = new int[n];

for(int i = 0; i< n; i++){
    A[i] = sc.nextInt();
}
int[] result = findNearestSmallerElements(A);
for(int num : result){
    System.out.print(num + " ");
}
    }
    }


