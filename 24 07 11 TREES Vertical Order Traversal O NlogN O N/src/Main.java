import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nodes in the format (node (left child)(right child)), enter 'null' for missing children: ");
        TreeNode root = buildTree(scanner);
        Solution solution = new Solution();
        int[][] result = solution.verticalOrderTraversal(root);
        System.out.println("Vertical order traversal result: ");
        for (int[] level : result) {
            System.out.println(Arrays.toString(level));
        }
    }

    private static TreeNode buildTree(Scanner scanner) {
        System.out.print("Enter root value: ");
        String rootVal = scanner.next();
        if (rootVal.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(rootVal));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print("Enter left child value of " + current.val + " (or 'null'): ");
            String leftVal = scanner.next();
            if (!leftVal.equals("null")) {
                current.left = new TreeNode(Integer.parseInt(leftVal));
                queue.add(current.left);
            }

            System.out.print("Enter right child value of " + current.val + " (or 'null'): ");
            String rightVal = scanner.next();
            if (!rightVal.equals("null")) {
                current.right = new TreeNode(Integer.parseInt(rightVal));
                queue.add(current.right);
            }
        }
        return root;
    }

    public int[][] verticalOrderTraversal(TreeNode root) {
        if (root == null) {
            return new int[0][0];
        }
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> levelQueue = new LinkedList<>();
        nodeQueue.add(root);
        levelQueue.add(0);

        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.poll();
            int level = levelQueue.poll();
            map.computeIfAbsent(level, k -> new LinkedList<>()).add(node.val);

            if (node.left != null) {
                nodeQueue.add(node.left);
                levelQueue.add(level - 1);
            }
            if (node.right != null) {
                nodeQueue.add(node.right);
                levelQueue.add(level + 1);
            }
        }

        int[][] result = new int[map.size()][];
        int i = 0;
        for (List<Integer> list : map.values()) {
            result[i] = list.stream().mapToInt(Integer::intValue).toArray();
            i++;
        }
        return result;
    }
}