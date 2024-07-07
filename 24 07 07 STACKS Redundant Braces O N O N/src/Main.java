import java.util.Scanner;
import java.util.Stack;
class RedundantBraces{
    public static int hasRedundantBraces(String A){
        Stack<Character> stack = new Stack<>();
        for(char ch : A.toCharArray()){
            if(ch == ')'){
                char top = stack.pop();
                boolean hasOperator = false;
                while(top != '('){
                    if(top == '+' || top == '-' || top == '*' || top == '/'){
                        hasOperator = true;
                    }
                    top = stack.pop();
                }
                if(!hasOperator){
                    return 1;
                }
            }
            else{
                stack.push(ch);
            }
        }




        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        int result = hasRedundantBraces(expression);
        System.out.println(result);
    }

}