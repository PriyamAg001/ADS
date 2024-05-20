import java.util.*;

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BST {
    TreeNode root;

    TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.value) {
            root.left = insert(root.left, value);
        } else if (value > root.value) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    TreeNode deleteLeafNodes(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left == null && root.right == null) {
            // Leaf node, delete it
            return null;
        }
        root.left = deleteLeafNodes(root.left);
        root.right = deleteLeafNodes(root.right);
        return root;
    }

    void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.value + " ");
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of nodes
        int[] nodes = new int[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = sc.nextInt();
            tree.root = tree.insert(tree.root, nodes[i]);
        }

        // Delete leaf nodes
        tree.root = tree.deleteLeafNodes(tree.root);

        System.out.print("Post-order Traversal after deletion: ");
        tree.postOrderTraversal(tree.root);
    }
}
