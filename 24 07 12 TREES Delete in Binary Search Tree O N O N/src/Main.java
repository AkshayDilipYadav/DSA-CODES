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
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int B) {
        if (root == null) {
            return null;
        }

        if (B < root.val) {
            root.left = deleteNode(root.left, B);
        } else if (B > root.val) {
            root.right = deleteNode(root.right, B);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode predecessor = findMax(root.left);
                root.val = predecessor.val;
                root.left = deleteNode(root.left, predecessor.val);
            }
        }
        return root;
    }

    private TreeNode findMax(TreeNode node) {
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

    // Function to build BST based on user input
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

    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        TreeNode root = solution.buildTree(sc);

        System.out.println("Inorder traversal of the BST:");
        solution.inorder(root);
        System.out.println();

        System.out.print("Enter the value to delete from BST: ");
        int B = sc.nextInt();

        root = solution.deleteNode(root, B);

        System.out.println("Inorder traversal after deletion:");
        solution.inorder(root);
        System.out.println();

        sc.close();
    }
}