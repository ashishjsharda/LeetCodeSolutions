package Trees;


//TreeNode class
class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

/**
 * Insert into BST
 * <a href>https://leetcode.com/problems/flip-equivalent-binary-trees/</a>
 * @author asharda
 *
 */

public class FlipEquivalent {

	/**
	 * Flip Equivalent Binary Tree
	 * @param root1
	 * @param root2
	 * @return boolean
	 */
	  public boolean flipEquiv(TreeNode root1, TreeNode root2) {
	        if (root1 == null && root2 == null) return true;
	        if (root1 == null || root2 == null) return false;
	        if (root1.val != root2.val) return false;
	        return (flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right)) || 
	            (flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left));
	    }

	public static void main(String[] args) {
		FlipEquivalent tree = new FlipEquivalent();
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		TreeNode node2=new TreeNode(1);
		node2.left=new TreeNode(3);
		node2.right=new TreeNode(2);
		System.out.println(tree.flipEquiv(node, node2));
		
		
	
	}

}
