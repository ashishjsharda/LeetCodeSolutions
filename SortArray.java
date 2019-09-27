import java.util.Arrays;

/**
 * Sort Array
 * <a href>https://leetcode.com/problems/sort-an-array/ </a>
 * @author asharda
 *
 */
public class SortArray {

	/**
	 * Sort Array
	 * @param nums
	 * @return int[]
	 */
	public int[] sortArray(int[] nums) {

		Arrays.sort(nums);
		for(int i:nums)
		{
			System.out.println(i);
		}

		return nums;
	}
	public static void main(String[] args) {

		SortArray arr=new SortArray();
		int []nums= {5,2,3,1};
		arr.sortArray(nums);

	}

}
