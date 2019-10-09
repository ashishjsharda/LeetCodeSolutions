
package Trees;

/**
 * PathSum
 * @author asharda
 * <a href> https://leetcode.com/problems/path-sum/ </a>
 *
 */
public class PathSum {

	/**
	 * Has Path Sum
	 * @param root
	 * @param sum
	 * @return boolean
	 */

	public boolean hasPathSum(TreeNode root, int sum) {

		if(root == null) return false;
		sum = sum - root.val;
		return root.left == null && root.right == null && sum == 0 
				? true : hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}
	public static void main(String[] args) {

		TreeNode node=new TreeNode(5);
		node.left=new TreeNode(4);
		node.right=new TreeNode(8);
		node.right.right=new TreeNode(4);
		node.right.right.right=new TreeNode(1);
		node.right.left=new TreeNode(13);
		node.left.left=new TreeNode(11);
		node.left.left.right=new TreeNode(2);
		node.left.left.left=new TreeNode(7);
		PathSum sum=new PathSum();
		System.out.println(sum.hasPathSum(node, 22));

	}

}
