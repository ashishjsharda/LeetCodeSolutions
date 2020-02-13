
/**
 * Node class
 */
class Node{
    int data;
    public Node(int data)
    {
        this.data=data;
    }
    Node left;
    Node right;
}

/**
 * Size of Binary Tree
 * @author ashish
 */
public class SizeOfBinaryTree {

    /**
     * Find size of binary tree
     * @param root
     * @return int
     */
    public int size(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return size(root.left)+size(root.right)+1;
    }
    public static void main(String[] args) {

        Node root=new Node(10);
        root.left=new Node(5);
        root.right=new Node(15);
        root.left.left=new Node(7);
        root.left.right=new Node(9);
        SizeOfBinaryTree size=new SizeOfBinaryTree();
        System.out.println("Size of binary tree is " +size.size(root));
    }
}
