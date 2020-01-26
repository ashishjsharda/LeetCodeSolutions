package test;


/**
 * <ahref>https://leetcode.com/problems/maximum-69-number/</a>
 * @author ashish
 *
 */
public class Maximum69Number {

	/**
	 * Return the max 69 Number
	 * @param num
	 * @return int
	 */
	public int maximum69Number (int num) {
		return num + helper(num, 1, 0);
	}

	/**
	 * Helper Function
	 * @param num
	 * @param base
	 * @param addition
	 * @return int
	 */
	private int helper(int num, int base, int addition) {
		if (num == 0) {
			return addition;
		}
		if (num % 10 == 6) {
			addition = 3 * base; 
		}
		return helper(num / 10, base * 10, addition);
	}
	public static void main(String[] args) {

		Maximum69Number num=new Maximum69Number();
		System.out.println(num.maximum69Number(9669));


	}

}
