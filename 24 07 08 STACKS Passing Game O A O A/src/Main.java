import java.util.Stack;
import java.util.Scanner;
class FootballEvent{
    public static int findFinalPossession(int A, int B, int[] C) {
        Stack<Integer> stack = new Stack<>();
        int currentPlayer = B;

        for(int i = 0; i< A; i++){
            if(C[i] == 0){
                if(!stack.isEmpty()){
                    currentPlayer = stack.pop();
                }
            }
            else{
                stack.push(currentPlayer);
                currentPlayer = C[i];
            }
        }
        return currentPlayer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] C = new int[A];
        for(int i = 0; i < A; i++){
            C[i] = sc.nextInt();
        }
        int result = findFinalPossession(A, B, C);
        System.out.print(result);
    }

}