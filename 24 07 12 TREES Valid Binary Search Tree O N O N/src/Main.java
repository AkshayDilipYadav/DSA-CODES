import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

class Solution {
    private TreeNode prev;

    public int isValidBST(TreeNode root) {
        prev = null;
        return isBST(root) ? 1 : 0;
    }

    private boolean isBST(TreeNode node) {
        if (node == null) {
            return true;
        }

        if (!isBST(node.left)) {
            return false;
        }

        if (prev != null && node.val <= prev.val) {
            return false;
        }

        prev = node;

        return isBST(node.right);
    }

    public TreeNode buildTree(Scanner sc) {
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
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        TreeNode root = solution.buildTree(scanner);
        int result = solution.isValidBST(root);
        System.out.println(result);
    }
}