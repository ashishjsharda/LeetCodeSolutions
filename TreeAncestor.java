//Problem :https://leetcode.com/problems/kth-ancestor-of-a-tree-node/
public class TreeAncestor {

     int[][] moveUp; // For every node we store node present (2^i) levels above it.
    int[] parent; // input parent array
    List<Integer>[] children; // Child to parent mapping
    int logJump; // Maximum Jump required.

    public TreeAncestor(int n, int[] parent) {
        this.logJump = (int)(Math.log(n)/Math.log(2));
        moveUp = new int[n][logJump+1];
        children = new List[n];
        for (int i=0;i<n;i++) {
            Arrays.fill(moveUp[i],-1);
            children[i] = new ArrayList<>();
        }
        // Fill the child array.
        for (int p=0;p<parent.length;p++) {
            if(parent[p]!=-1) {
                children[parent[p]].add(p);
            }
        }
        this.parent = parent;
        fillMemo(0,-1);
    }

    private void fillMemo(int node,int par) {

        // one level up would be the parent.
        moveUp[node][0]=par;
        for (int i=1;i<=logJump;i++) {
            if(moveUp[node][i-1]!=-1) {
                moveUp[node][i] = moveUp[moveUp[node][i-1]][i-1];
            } else {
                moveUp[node][i] = -1;
            }
        }
        for (int child : children[node]) {
            fillMemo(child,node);
        }

    }

    public int getKthAncestor(int node, int k) {
        if(k==0 || node==-1) {
            return node;
        }
        for (int i=logJump;i>=0;i--) {
            // make largest possible jump in the power of two.
            if((1<<i)<=k) {
                return getKthAncestor(moveUp[node][i],k-(1<<i));
            }
        }
        return -1;
    }
}
