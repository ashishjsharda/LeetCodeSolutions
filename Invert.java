
/**
 * Invert a Binary Tree
 * @author asharda
 * <a href>https://leetcode.com/problems/invert-binary-tree/</a>
 *
 */


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class Invert {

    /**
     * Invert Tree
     * @param root
     * @return TreeNode
     */
    public TreeNode invertTree(TreeNode root) {
        if(root == null)
            return null;

        TreeNode node = new TreeNode(root.val);
        node.left = invertTree(root.right);
        node.right = invertTree(root.left);

        return node;
    }

    /**
     * Inorder display to print a tree
     * @param root
     */

    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {

        TreeNode node=new TreeNode(3);
        node.left=new TreeNode(9);
        node.right=new TreeNode(20);
        node.right.left=new TreeNode(15);
        node.right.right=new TreeNode(7);
        Invert in=new Invert();
        in.invertTree(node);
        in.inorder(node);

    }

}
