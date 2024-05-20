import java.util.Scanner;

class treeNode {
    int val;
    treeNode left;
    treeNode right;

    treeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class leafNode {
    public static treeNode insert(treeNode root, int val) {
        if (root == null) {
            return new treeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void printLeafNodes(treeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
        }
        printLeafNodes(root.left);
        printLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of nodes: ");
        int n = sc.nextInt();

        treeNode root = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for node " + (i + 1) + ": ");
            int value = sc.nextInt();
            root = insert(root, value);
        }

        System.out.println("Leaf nodes:");
        printLeafNodes(root);
    }
}
