   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

   /**
    * Add Two Numbers
    * LeetCode :https://leetcode.com/problems/add-two-numbers/
    */
   public class AddTwoNumbers {

    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = null;int remainValue=0;ListNode rootNode=null;
        while (l1 != null || l2 != null) {
            int val1 = 0;
            if (l1 != null) {
                val1 = l1.val;
                l1 = l1.next;

            }
            int val2 = 0;
            if (l2 != null) {
                val2 = l2.val;
                l2 = l2.next;

            }
            int total=val2 + val1+remainValue;
            if(total>=10) {
                total=total-10;
                remainValue=1;
            }else {
                remainValue=0;
            }
            if (rootNode == null) {
                rootNode = new ListNode((total), null);
                node=rootNode;
                System.out.println("val inside is "+node.val);

            } else {
                node.next = new ListNode((total), null);
                node=node.next;
                System.out.println("val inside is "+node.val);

            }

        }
        if(remainValue!=0) {
            node.next = new ListNode((remainValue), null);

        }
        return rootNode;
    }

    public static void main(String[] args) {

        ListNode listNode=new ListNode(10);
        ListNode listNode2=new ListNode(20);
        ListNode listNode3=addTwoNumbers(listNode,listNode2);
        System.out.println(listNode3.val);
    }
}
