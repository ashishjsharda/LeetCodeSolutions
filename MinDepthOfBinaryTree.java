//TreeNode Class

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}

/**
 * Find Minimum Depth of a Binary Tree	
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * @author asharda
 *
 */
public class MinDepthOfBinaryTree {

	/**
	 * Find the minimum depth using Recursion 
	 * @param root
	 * @return int
	 */

	public int minDepth(TreeNode root)
	{
		if(root==null)
		{
			return 0;
		}
		else if(root.left==null)
		{
			return minDepth(root.right)+1;
		}
		else if(root.right==null)
		{
			return minDepth(root.left)+1;
		}

		return Math.min(minDepth(root.left),minDepth(root.right))+1;


	}
	public static void main(String[] args) {

		TreeNode node=new TreeNode(3);
		node.left=new TreeNode(9);
		node.right=new TreeNode(20);
		node.right.left=new TreeNode(15);
		node.right.right=new TreeNode(7);
		MinDepthOfBinaryTree tree=new MinDepthOfBinaryTree();
		int depth=tree.minDepth(node);
		System.out.println(depth);


	}

}
