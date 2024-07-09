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
class PreorderTraversal{
    private int countNodes(TreeNode root){
        if(root == null){return 0;}
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public void preorderTraversal(TreeNode root, int[] result, int[] index){
        if(root == null){return;}
        result[index[0]++] = root.val;
        preorderTraversal(root.left, result, index);
        preorderTraversal(root.right, result, index);
    }

    public TreeNode buildTree(Scanner sc){
        System.out.println("Enter value for root node: ");
        int val = sc.nextInt();
        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode current = queue.poll();
            System.out.println("Enter left child of " + current.val + " (enter -1 if no child): ");
            int leftVal = sc.nextInt();
            if(leftVal != -1){
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }
            System.out.println("Enter right child of " + current.val + " (enter -1 if no child): ");
int rightVal = sc.nextInt();
if(rightVal != -1){
    current.right = new TreeNode(rightVal);
    queue.add(current.right);
}

        }return root;
    }

    public static void main(String[] args){
        PreorderTraversal obj = new PreorderTraversal();
        Scanner sc = new Scanner(System.in);
        TreeNode root = obj.buildTree(sc);

        int  nodeCount = obj.countNodes(root);
        int[] result = new int[nodeCount];
        int[] index = new int[1];
        obj.preorderTraversal(root, result, index);
        System.out.println("Preorder Traversal: ");
        for(int val : result){
            System.out.print(val + " ");
        }
    }

}