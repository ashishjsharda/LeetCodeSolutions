package leets;

import java.util.HashSet;
import java.util.Set;

/**
  * ListNode Class
  *
  */
class ListNode
{
  int val;
  ListNode next;
  ListNode(int x)
  {
    val=x;
    next=null;
  }

}

/**
  * LinkedList Cycle 
  * @author asharda
  *
  */
public class LinkedListCycle {


  /**
    * Check if LinkedList has a cycle
    * @param head
    * @return boolean
    */
  public boolean hasCycle(ListNode head) {
    Set<ListNode> visited=new HashSet<ListNode>();
    while(head!=null)
    {
      if(visited.contains(head))
      {
        return true;
      }
      else
      {
        visited.add(head);
      }

      head=head.next;

    }//end of while

    return false;
  }
  public static void main(String[] args) {

    ListNode node=new ListNode(3);
    node.next=new ListNode(2);
    node.next.next=new ListNode(0);
    node.next.next.next=new ListNode(-4);
    LinkedListCycle cycle=new LinkedListCycle();
    System.out.println(cycle.hasCycle(node));

  }

}
