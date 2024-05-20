import java.util.*;

class rightView {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    rightView() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    void rightView() {
        rightViewUtil(root, 1);
    }

    int maxLevel = 0;

    void rightViewUtil(Node node, int level) {
        if (node == null) return;

        if (level > maxLevel) {
            System.out.print(node.data + " ");
            maxLevel = level;
        }

        // Traverse right subtree first to get the right view
        rightViewUtil(node.right, level + 1);
        rightViewUtil(node.left, level + 1);
    }

    public static void main(String args[]) {
        rightView tree = new rightView();
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        tree.rightView();
        scanner.close();
    }
}
