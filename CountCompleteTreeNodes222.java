import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ListIterator;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class CountCompleteTreeNodes222 {
    public int countNodes(TreeNode root) {   //O(n) time and O(1) space
        if(root == null) return 0;           //base case
       return countNodes(root.left) + countNodes(root.right) + 1; //recursive case
   }

    public static void main(String[] args) {
        CountCompleteTreeNodes222 p = new CountCompleteTreeNodes222();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(p.countNodes(root));
    }
}
