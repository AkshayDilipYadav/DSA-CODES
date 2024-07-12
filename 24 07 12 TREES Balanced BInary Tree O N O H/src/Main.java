import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x){
        val = x;
        left = null;
        right = null;
    }

}

class Solution{
    public static int isBalanced(TreeNode root){
        return isBalancedHelper(root) != -1 ? 1:0;
    }
    public static int isBalancedHelper(TreeNode node) {
        if(node == null){return 0;}
        int leftHeight = isBalancedHelper(node.left);
        if(leftHeight == -1){return -1;}
        int rightHeight = isBalancedHelper(node.right);
        if(rightHeight == -1){return -1;}
        if(Math.abs(leftHeight - rightHeight)> 1){return -1;}
        return Math.max(leftHeight, rightHeight)+ 1;
    }
    public static TreeNode buildTree(Scanner sc){
        System.out.print("Enter node value (-1 for null): ");
        int val = sc.nextInt();
        if(val == -1){
            return null;
        }
        TreeNode node = new TreeNode(val);
        System.out.println("Enter left child of " + val);
        node.left = buildTree(sc);
        System.out.println("Enter right child of " + val);
        node.right = buildTree(sc);
        return node;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary tree:");
        TreeNode root = buildTree(sc);
        int result = isBalanced(root);
        System.out.println("Is the tree height-balanced? " + (result == 1 ? "Yes" : "No"));

    }

}