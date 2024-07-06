import com.sun.source.tree.Tree;

import java.util.*;

public class Q6LCA {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public static int sol(TreeNode root, int p, int q){
        if(root == null){
            return -1;
        }
        if(root.val == p || root.val == q){
            return root.val;
        }
        int left = sol(root.left, p, q);
        int right = sol(root.right, p, q);
        if(left != -1 && right != -1){
            return root.val;
        }
        else if(left != -1){
            return left;
        }
        return right;
    }

    public static TreeNode sol(TreeNode root, int k){
        if(root == null) {
            return new TreeNode(k);
        }
        if(root.val > k) {
            root.left = sol(root.left, k);
        }
        else if(root.val < k){
            root.right = sol(root.right, k);
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int p = sc.nextInt();
        int q = sc.nextInt();
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(str[i]);
        }

        TreeNode root = sol(null, arr[0]);
        for(int i=1; i<arr.length; i++){
            root = sol(root, arr[i]);
        }
        System.out.println(sol(root, p, q));
    }
}
