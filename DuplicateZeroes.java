/**
 * Duplicate Zeroes
 * @author asharda
 * <a href>https://leetcode.com/problems/duplicate-zeros/</a>
 *
 */
public class DuplicateZeroes {

	/**
	 * Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
	 * @param arr
	 */
	 public static void duplicateZeros(int[] arr) {
		 int len = arr.length;
	        for(int i = 0; i < len; i++){
	            if(arr[i] == 0){
	                for(int j = len - 1; j > i; j--){
	                    arr[j] = arr[j-1];
	                }
	                i++;
	            }
	        }
	        
	        for (int i:arr)
	        {
	        	System.out.println(i);
	        }
	        
	    }
	public static void main(String[] args) {
		
		int []arr= {1,2,0,3,4,0,0,5};
		duplicateZeros(arr);

	}

}
