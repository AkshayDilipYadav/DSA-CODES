import java.util.*;
class SlidingWindowMaximum{
    public static int[] maxSlidingWindow(int[] A, int B){
        if(A == null || B <= 0){
            return new int[0];
        }
        int n = A.length;
        int[] result = new int[n - B + 1];
        Deque<Integer> deq = new LinkedList<>();

        for(int i = 0; i< n; i++){
            if(!deq.isEmpty() && deq.peekFirst() < i - B + 1){
                deq.pollFirst();
            }

            while(!deq.isEmpty() && A[deq.peekLast()] < A[i]){
                deq.pollLast();
            }

            deq.offerLast(i);

            if(i >= B -1){
                result[i - B + 1] = A[deq.peekFirst()];
            }


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
        int[] result = maxSlidingWindow(A, B);
        System.out.print(Arrays.toString(result));
    }

}