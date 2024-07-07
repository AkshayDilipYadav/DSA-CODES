import java.util.Scanner;
import java.util.Stack;
class LargestRectangleHistogram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] heights = new int[n];
        for(int i = 0; i< n; i++){
            heights[i] = sc.nextInt();
        }
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;

        while(index < heights.length){
            if(stack.isEmpty() || heights[index] >= heights[stack.peek()]){
                stack.push(index++);
            }
            else{
                int topOfStack = stack.pop();
                int area = heights[topOfStack] * (stack.isEmpty() ? index : index - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        while(!stack.isEmpty()){
            int topOfStack = stack.pop();
            int area = heights[topOfStack] * (stack.isEmpty() ? index : index - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }


}