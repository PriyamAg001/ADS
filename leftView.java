import java.util.*;
class leftView {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    Node root;

    leftView() {
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

        if (key < root.data){
            root.left = insertRec(root.left, key);
        }
        else if (key > root.data) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    void leftView() {
        leftViewUtil(root, 1);
    }
    int max=0;
    void leftViewUtil(Node node, int level) {
        // Write code here
        if(node==null) return ;
        if(level>max){
            System.out.print(node.data+" ");
            max=level;
        }
        leftViewUtil(node.left,level+1);
        leftViewUtil(node.right,level+1);
    }

    int maxLevel = 0;

    public static void main(String args[]) {
        leftView tree = new leftView();
        Scanner scanner = new Scanner(System.in);
        int numNodes = scanner.nextInt();
        for (int i = 0; i < numNodes; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }
        tree.leftView();
        scanner.close();
    }
}