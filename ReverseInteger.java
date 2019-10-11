/**
 * ReverseInteger
 * @author asharda
 *
 */
public class ReverseInteger {

	/**
	 * Reverse an Integer
	 * @param x
	 * @return int
	 */
	public int reverse(int x) {
		int ret = 0;
		while (x != 0) {
			ret = ret * 10 + x % 10;
			x /= 10;
		}
		return ret;
	}

	public static void main(String[] args) {

		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverse(123));

	}

}
