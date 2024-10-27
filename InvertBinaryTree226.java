public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        helper(root);
        return root;
    }
    private void helper(TreeNode root) {
        if (root == null) return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        helper(root.left);
        helper(root.right);
    }
    public static void main(String[] args) {
        InvertBinaryTree226 p = new InvertBinaryTree226();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        p.invertTree(root);
        System.out.println(root);
    }
}
