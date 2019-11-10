
/**
 * ListNode 
 * 
 */
class ListNode {
	int val;
	ListNode next;
	 ListNode(int x) { val = x; }
}
/**
 * Reverse a Linked List
 * @author asharda
 *
 */
public class ReverseLinkedList {

	/**
	 * Reverse Linked List
	 * @param current
	 * @return ListNode
	 */
	 public ListNode reverseList(ListNode current) {
	        if (current == null || current.next == null) return current;
	        
	        ListNode head = reverseList(current.next);
	        current.next.next = current;
	        current.next = null;
	        
	        return head;
	    }
	public static void main(String[] args) {

		ReverseLinkedList list=new ReverseLinkedList();
		ListNode node =new ListNode(1);
		node.next=new ListNode(2);
		node.next.next=new ListNode(3);
		ListNode root=list.reverseList(node);
		while(root!=null)
		{
			System.out.println(root.val);
			root=root.next;
		}
	}

}
