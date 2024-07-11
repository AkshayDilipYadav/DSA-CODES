import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int x){
        val = x;
        left = right = null;
    }
}

class BinaryTree{
    public static TreeNode createTree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of nodes: ");
        int n = scanner.nextInt();
        if(n == 0){return null;}
System.out.println("Enter the value of the root node:");
        TreeNode root = new TreeNode(scanner.nextInt());
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for(int i = 1; i< n; i++){
            TreeNode current = queue.poll();
            System.out.println("Enter left Child of " + current.val + " (enter -1 if no child):");
            int leftVal = scanner.nextInt();
            if(leftVal != -1){
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }
            System.out.println("Enter right child of " + current.val + " (enter -1 if no child):");
            int rightVal = scanner.nextInt();
            if(rightVal != -1){
                current.right = new TreeNode(rightVal);
                queue.add(current.right);
            }
        }
        return root;
    }
}
class Solution{
    public int[][] levelOrder(TreeNode root) {
        if(root == null){return new int[0][0];}
        int height = getHeight(root);
        int[][] result = new int[height][];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        for(int level = 0; level < height; level++){
            int levelSize = queue.size();
            result[level] = new int[levelSize];
            for(int i = 0; i < levelSize; i++){
                TreeNode currentNode = queue.poll();
                result[level][i] = currentNode.val;
                if(currentNode.left != null){queue.add(currentNode.left);}
                if(currentNode.right != null){queue.add(currentNode.right);}
            }
        }
        return result;
    }

    private int getHeight(TreeNode root){
        if(root == null){return 0;}
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight)+ 1;
    }
}
public class Main{
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        TreeNode root = bt.createTree();
        Solution solution = new Solution();
        int[][] result = solution.levelOrder(root);
        System.out.println("Level Order Traversal:");
        for(int[] level : result){
            for(int val : level){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}