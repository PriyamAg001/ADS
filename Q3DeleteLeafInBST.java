import java.util.*;

public class Q3DeleteLeafInBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Method to insert a value into the BST
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        }
        else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    // Method to delete leaf nodes from the BST
    public static TreeNode deleteLeaf(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return null; // Base case: leaf node
        }
        root.left = deleteLeaf(root.left);
        root.right = deleteLeaf(root.right);
        return root;
    }

    // Method to print the BST in postorder
    public static void print(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root.left);
        print(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 7; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = null;
        for (int i = 0; i < 7; i++) {
            root = insert(root, arr[i]);
        }
        root = deleteLeaf(root);
        print(root);
    }
}
