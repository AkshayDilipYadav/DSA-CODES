import java.util.Scanner;
import java.util.Stack;
class BalancedParentheses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        System.out.println(isBalanced(A));
    }
    public static int isBalanced(String A){
        Stack<Character> stack = new Stack<>();
        for(char ch : A.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){return 0;}

                char top = stack.pop();
                if((ch == ')' && top !='(') || (ch == '}' && top !='{') || (ch == ']' && top !='[')){
                    return 0;
                }
            }
        }
        return stack.isEmpty() ? 1:0;
    }

}