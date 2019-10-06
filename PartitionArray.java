/**
 * PartitionArray
 * <a href>https://leetcode.com/problems/partition-array-for-maximum-sum/</a>
 * @author asharda
 *
 */
public class PartitionArray {

	/**
	 * Max sum after partition
	 * @param A
	 * @param K
	 * @return int
	 */
	 public int maxSumAfterPartitioning(int[] A, int K) {
	     int[] DP = new int[A.length];
	        int max = A[0];
	        for(int i=0;i<K;i++){
	            if(A[i]>max)    max = A[i];
	            DP[i] = max * (i+1);
	        }
	        for(int i=K;i<A.length;i++){
	            max = A[i];
	            for(int j=i-1;j>=i-K;j--){
	                if(A[j+1]>max)  max = A[j+1];
	                DP[i] = Math.max(DP[i], DP[j]+max*(i-j));
	            }
	        }
	        return DP[DP.length-1];
	    }
	public static void main(String[] args) {
	
		PartitionArray p=new PartitionArray();
		int arr[]= {1,15,7,9,2,5,10};
		System.out.println(p.maxSumAfterPartitioning(arr, 3));
	}

}
