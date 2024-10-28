import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MergeTwoBinaryTree617 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        return root1;
    }

    // Method to print the tree in-order
    public void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.val + " ");
            printInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        MergeTwoBinaryTree617 obj = new MergeTwoBinaryTree617();
        
        // Create first tree
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        
        // Create second tree
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        
        // Merge the trees
        TreeNode mergedRoot = obj.mergeTrees(root1, root2);
        
        // Print the merged tree in-order
        System.out.println("Merged Tree (In-Order):");
        obj.printInOrder(mergedRoot);
    }
}