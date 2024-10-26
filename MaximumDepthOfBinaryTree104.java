public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return left>right ? left+1 : right+1;
    }
    public static void main(String[] args) {
         MaximumDepthOfBinaryTree104 p = new MaximumDepthOfBinaryTree104();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode();
        root.left.right = new TreeNode();
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.right.right.right = new TreeNode(1);
        System.out.println(p.maxDepth(root));
    }
}
