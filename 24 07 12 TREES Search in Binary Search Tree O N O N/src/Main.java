import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}


class Solution {
    public int exists(TreeNode root, int B) {
        return search(root, B) ? 1 : 0;
    }

    private boolean search(TreeNode root, int val) {
        if (root == null) return false;
        if (root.val == val) return true;
        if (val < root.val) return search(root.left, val);
        return search(root.right, val);
    }
}



public class Main {

    public static TreeNode buildTree(Scanner sc) {
        System.out.println("Enter value for root node: ");
        int val = sc.nextInt();
        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println("Enter left child of " + current.val + " (enter -1 if no child): ");
            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.add(current.left);
            }
            System.out.println("Enter right child of " + current.val + " (enter -1 if no child): ");
            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.add(current.right);
            }
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        TreeNode root = buildTree(sc);

        System.out.print("Enter the value to search for: ");
        int B = sc.nextInt();

        Solution solution = new Solution();
        int result = solution.exists(root, B);

        System.out.println("Result: " + result);
    }
}