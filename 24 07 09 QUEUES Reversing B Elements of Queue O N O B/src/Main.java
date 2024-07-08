import java.util.*;

class ReverseFirstBElements{
    public static int[] reverseFirstBElements(int[] A, int B){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i< B; i++){
            queue.add(A[i]);
        }

        Stack<Integer> stack = new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        int[] result = new int[A.length];
        int index = 0;
        while(!stack.isEmpty()){
            result[index++] = stack.pop();
        }
        for(int i = B; i < A.length; i++){
            result[index++] = A[i];
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i = 0; i< n; i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int[] result = reverseFirstBElements(A, B);
        for(int i : result){System.out.print(i + " ");}
    }

}