import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Delete Nodes
 * @author asharda
 *
 */

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) { val = x; }
}
public class DeleteNodes {

	List<TreeNode> re = new ArrayList<>();

	/**
	 * Delete Nodes
	 * @param root
	 * @param to_delete
	 * @return List<TreeNode>
	 */
	public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

		Set<Integer> set = new HashSet<>();
		for(int i : to_delete) set.add(i);
		helper(root, set);
		if(set.contains(root.val)) return re;
		else {
			re.add(root);
			return re;
		}

	}

	/**
	 * Helper function
	 * @param root
	 * @param set
	 * @return TreeNode
	 */
	public TreeNode helper(TreeNode root,Set<Integer> set){
		if(root == null) return null;
		root.left = helper(root.left, set);
		root.right = helper(root.right, set);
		if(set.contains(root.val)){
			if(root.left != null) re.add(root.left);
			if(root.right != null) re.add(root.right);
			return null;
		}

		return root;

	}

	public static void main(String[] args) {


		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.left=new TreeNode(4);
		node.left.right=new TreeNode(5);
		node.right.left=new TreeNode(6);
		node.right.right=new TreeNode(7);
		DeleteNodes d=new DeleteNodes();
		int arr[]= {3,5};
		List<TreeNode>t=d.delNodes(node, arr);
		for(TreeNode i:t)
		{
			System.out.println(i.val);
		}
	}

}
