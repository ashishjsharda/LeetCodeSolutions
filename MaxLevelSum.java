import java.util.LinkedList;
import java.util.Queue;
/**
 * Max Levl of a Binary Tree
 * https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
 * @author asharda
 *
 */


class TreeNodes {
	int val;
	TreeNodes left;
	TreeNodes right;
	TreeNodes(int x) { val = x; }
}
public class MaxLevelSum {

	/**
	 * Return the max Levl Sum
	 * @param root
	 * @return int
	 */
	 public int maxLevelSum(TreeNodes root) {
	        Queue<TreeNodes> queue = new LinkedList<>();
	        queue.offer(root);
	        int[] res = new int[2];
	        
	        int level = 1;
	        while (!queue.isEmpty()) {
	            int size = queue.size();
	            int sum = 0;
	            for (int i = 0; i < size; i++) {
	                TreeNodes cur = queue.poll();
	                sum += cur.val;
	                if (cur.left != null) queue.offer(cur.left);
	                if (cur.right != null) queue.offer(cur.right);
	            }
	            
	            if (sum > res[0]) {
	                res[0] = sum;
	                res[1] = level;
	            }
	            level++;
	        }
	        return res[1];
	    }
	public static void main(String[] args) {

		MaxLevelSum  sum=new MaxLevelSum ();
		TreeNodes node=new TreeNodes(1);
		node.left=new TreeNodes(7);
		node.right=new TreeNodes(0);
		node.right.left=new TreeNodes(7);
		node.right.right=new TreeNodes(-8);
		int sums=sum.maxLevelSum(node);
		System.out.println(sums);
	}

}
