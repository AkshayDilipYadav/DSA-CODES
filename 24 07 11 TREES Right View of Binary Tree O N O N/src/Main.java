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

class RightViewBinaryTree{
    public static TreeNode inputTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the root value: ");
        int val = sc.nextInt();
        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println("Enter left Child of " + node.val + " (-1 for no left child): ");
            int leftVal = sc.nextInt();
            if(leftVal != -1){
                node.left = new TreeNode(leftVal);
                queue.add(node.left);
            }
            System.out.println("Enter right child of " + node.val + " (-1 for no right child): ");
            int rightVal = sc.nextInt();
            if(rightVal != -1){
                node.right = new TreeNode(rightVal);
                queue.add(node.right);
            }
        }
        return root;
    }
    public static int getHeight (TreeNode root){
        if(root == null){return 0;}
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static int[] rightView(TreeNode root) {
        if(root == null){return new int[0];}
        int height = getHeight(root);
        int[] rightViewArray = new int[height];
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            TreeNode rightMostNode = null;
            for(int i = 0; i< levelSize; i++){
                TreeNode node = queue.poll();
                rightMostNode = node;
                if(node.left != null){queue.add(node.left);}
                if(node.right != null){queue.add(node.right);}
            }
            if(rightMostNode != null){
                rightViewArray[level] = rightMostNode.val;
            }
            level++;
        }
        return rightViewArray;
    }

    public static void main(String[] args){
        TreeNode root = inputTree();
        int[] rightView = rightView(root);
        System.out.println("Right view of the Binary Tree");
        for(int val : rightView){
            System.out.print(val + " ");
        }
    }
}