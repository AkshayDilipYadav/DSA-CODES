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
    public TreeNode sortedArrayToBST(int[] A) {
        if (A == null || A.length == 0) {
            return null;
        }

        return sortedArrayToBSTHelper(A, 0, A.length - 1);
    }

    private TreeNode sortedArrayToBSTHelper(int[] A, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(A[mid]);

        root.left = sortedArrayToBSTHelper(A, start, mid - 1);
        root.right = sortedArrayToBSTHelper(A, mid + 1, end);

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

        System.out.print("Enter the length of the sorted array: ");
        int n = sc.nextInt();

        int[] sortedArray = new int[n];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < n; i++) {
            sortedArray[i] = sc.nextInt();
        }

        Solution solution = new Solution();

        TreeNode root = solution.sortedArrayToBST(sortedArray);

        System.out.println("Inorder traversal of the height-balanced BST:");
        solution.inorder(root);
        System.out.println();

        sc.close();
    }
}