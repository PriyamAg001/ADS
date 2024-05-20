import java.util.Scanner;
public class diameterOfBST {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }
    static int max=0;

    public static int sol(TreeNode root){
        if(root==null) return 0;
        int left=sol(root.left);
        int right=sol(root.right);
        max=Math.max(left+right,max);
        return 1+Math.max(right,left);
    }
    public static TreeNode sol(TreeNode root, int k){
        if(root==null) return new TreeNode(k);
        if(root.val>k) root.left=sol(root.left,k);
        else if(root.val<k) root.right=sol(root.right,k);
        return root;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) arr[i]=sc.nextInt();
        TreeNode root=new TreeNode(arr[0]);
        for(int i=1;i<n;i++) root=sol(root,arr[i]);
        sol(root);
        System.out.println(max+1);
    }
}