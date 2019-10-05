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
 * <a href>https://leetcode.com/problems/insert-into-a-binary-search-tree/</a>
 * @author asharda
 *
 */

public class BinTree {

	static TreeNode roots ;
	static TreeNode temp;
	/**
	 * Insert into BST
	 * @param root
	 * @param val
	 * @return TreeNode
	 */
	public TreeNode insertIntoBST(TreeNode root, int val) {

		 if (val < root.val)
		    {
		        if (root.left != null)
		        {
		        	insertIntoBST(root.left, val);
		        } 
		        else
		        {     
		        	root.left = new TreeNode(val);
		        }
		    } 
		    else if (val > root.val)
		    {
		        if (root.right != null)
		        {
		        	insertIntoBST(root.right, val);
		        }
		        else
		        {
		        	root.right = new TreeNode(val);
		        }
		    }
		 
		 return root;
	}

	/**
	 * Inorder Display
	 * @param root
	 */
	public void display(TreeNode root) {
		if (root == null) {
			return;
		}
		display(root.left);
		System.out.println(root.val);
		display(root.right);
	}

	public static void main(String[] args) {

		
		BinTree tree = new BinTree();
		roots=new TreeNode(6);
		tree.insertIntoBST(roots, 5);
		tree.insertIntoBST(roots, 7);
		tree.display(roots);

	}

}
