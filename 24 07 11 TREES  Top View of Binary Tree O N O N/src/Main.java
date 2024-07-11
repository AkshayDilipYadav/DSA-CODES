import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {

    class QueueNode {
        TreeNode node;
        int hd;
        QueueNode(TreeNode n, int h) {
            node = n;
            hd = h;
        }
    }

    public static TreeNode buildTree(Scanner scanner) {
        System.out.println("Enter the root value (or type 'null' for no value):");
        String rootValue = scanner.nextLine();
        if (rootValue.equals("null")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(rootValue));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();

            System.out.println("Enter the left child of " + currentNode.val + " (or type 'null' for no value):");
            String leftValue = scanner.nextLine();
            if (!leftValue.equals("null")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(leftValue));
                currentNode.left = leftNode;
                queue.add(leftNode);
            }

            System.out.println("Enter the right child of " + currentNode.val + " (or type 'null' for no value):");
            String rightValue = scanner.nextLine();
            if (!rightValue.equals("null")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(rightValue));
                currentNode.right = rightNode;
                queue.add(rightNode);
            }
        }

        return root;
    }

    public int[] topView(TreeNode root) {
        if (root == null) return new int[0];

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<QueueNode> queue = new LinkedList<>();

        queue.add(new QueueNode(root, 0));

        while (!queue.isEmpty()) {
            QueueNode temp = queue.poll();
            int hd = temp.hd;
            TreeNode node = temp.node;

            if (!map.containsKey(hd)) {
                map.put(hd, node.val);
            }

            if (node.left != null) {
                queue.add(new QueueNode(node.left, hd - 1));
            }

            if (node.right != null) {
                queue.add(new QueueNode(node.right, hd + 1));
            }
        }

        int[] topView = new int[map.size()];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            topView[index++] = entry.getValue();
        }

        return topView;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        TreeNode root = buildTree(scanner);
        int[] topViewResult = solution.topView(root);

        System.out.println("Top view of the binary tree:");
        for (int value : topViewResult) {
            System.out.print(value + " ");
        }
    }
}