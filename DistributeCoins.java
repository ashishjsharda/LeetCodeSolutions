package duplicates;

/**
 * Distribute Coins 
 * <a href>https://leetcode.com/problems/distribute-coins-in-binary-tree/ </a>
 * @author asharda
 *
 */


class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class DistributeCoins {

	private int count=0;
	/**
	 * Distribute Coins
	 * @param root
	 * @return int
	 */
	 public int distributeCoins(TreeNode root) {
         dfsPostorder(root);
         return count;
 }
	 
	 /**
	  * Use PostOrder
	  * @param root
	  * @return int
	  */
	 public int dfsPostorder(TreeNode root)
	 {
		 if(root==null)
		 {
			 return  0;
		 }
		 int l=dfsPostorder(root.left);
		 int r=dfsPostorder(root.right);
		 count+=Math.abs(l)+Math.abs(r);
		 return root.val+l+r-1;
	 }
	public static void main(String[] args) {
		
		TreeNode node=new TreeNode(3);
		node.left=new TreeNode(0);
		node.right=new TreeNode(0);
		DistributeCoins d=new DistributeCoins();
		System.out.println(d.distributeCoins(node));
		
	}

}
