import java.util.*;

public class bottomView {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static void bottomView(TreeNode root) {
        if (root == null) return;

        // Map to store the last encountered node at each horizontal distance
        Map<Integer, Integer> map = new TreeMap<>(); // TreeMap for sorted keys

        // Queue for level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> hdQueue = new LinkedList<>(); // Queue for HD

        queue.offer(root);
        hdQueue.offer(0);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            int hd = hdQueue.poll();

            // Update the map with the current node's value
            map.put(hd, curr.val);

            if (curr.left != null) {
                queue.offer(curr.left);
                hdQueue.offer(hd - 1);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
                hdQueue.offer(hd + 1);
            }
        }

        // Print the bottom view nodes
        for (int val : map.values()) {
            System.out.print(val + " ");
        }
    }

    public static TreeNode sol(TreeNode root, int k) {
        if (root == null) return new TreeNode(k);
        if (root.val > k) root.left = sol(root.left, k);
        else if (root.val < k) root.right = sol(root.right, k);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int x = sc.nextInt();
        }
        TreeNode root = new TreeNode(arr[0]);
        for (int i = 1; i < n; i++) {
            root = sol(root, arr[i]);
        }
        bottomView(root);
    }
}
