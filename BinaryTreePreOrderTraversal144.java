import java.util.ArrayList;
import java.util.List;
public class BinaryTreePreOrderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> preOrder=new ArrayList<>();
        preOrder(root,preOrder);
        return preOrder;
        }
        void preOrder(TreeNode curr, ArrayList<Integer> preOrder){
            if (curr==null){
                return;
            }
            preOrder.add(curr.val);
            preOrder(curr.left,preOrder);
            preOrder(curr.right,preOrder);
        }
        public static void main(String[] args) {
            BinaryTreePreOrderTraversal144 p = new BinaryTreePreOrderTraversal144();
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            System.out.println(p.preorderTraversal(root));
        }
}
