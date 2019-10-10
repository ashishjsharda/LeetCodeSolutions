/**
 * Find Peak Index <a href >https://leetcode.com/problems/find-pivot-index/ </a>
 * 
 * @author asharda
 *
 */
public class FindPeakIndex {

	/**
	 * Return the pivot index
	 * 
	 * @param nums
	 * @return int
	 */
	public int pivotIndex(int[] nums) {
		int total = 0;
		for (int i : nums)
			total += i;

		int sum = 0;
		int index = 0;
		for (int i : nums) {
			int prev = sum;
			sum += i;
			int next = total - sum;
			if (next == prev)
				return index;
			index++;
		}
		return -1;
	}

	public static void main(String[] args) {

		FindPeakIndex index = new FindPeakIndex();
		int arr[] = { 1, 7, 3, 6, 5, 6 };
		System.out.println(index.pivotIndex(arr));
	}

}
