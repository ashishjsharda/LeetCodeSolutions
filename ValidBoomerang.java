
/**
 * Valid Boomerang
 * <a href>https://leetcode.com/problems/valid-boomerang/</a>
 * @author asharda
 *
 */
public class ValidBoomerang {


	/**
	 * Get Slope
	 * @param point1
	 * @param point2
	 * @return float
	 */
	public float getSlope(int[] point1, int[] point2) {
		if (point1[0] == point2[0]) {
			return Integer.MAX_VALUE * 1f;
		}
		return ((point2[1] - point1[1]) * 1f) / ((point2[0] - point1[0]) * 1f);
	} 

	/**
	 * Check if 2 points are equal
	 * @param point1
	 * @param point2
	 * @return boolean
	 */
	public boolean isAnyTwoPointsEqual(int[] point1, int[] point2) {
		return point1[0] == point2[0] && point1[1] == point2[1];
	}

	/**
	 * Check if array is a boomerang
	 * @param points
	 * @return boolean
	 */
	public boolean isBoomerang(int[][] points) {
		int[] point1 = points[0];
		int[] point2 = points[1];
		int[] point3 = points[2];
		if (isAnyTwoPointsEqual(point1, point2) || isAnyTwoPointsEqual(point2, point3) || isAnyTwoPointsEqual(point1, point3)) {
			return false;
		}
		return getSlope(point1, point2) != getSlope(point2, point3);
	}
	public static void main(String[] args) {

		ValidBoomerang b=new ValidBoomerang();
		int [][]arr= {
				{
					1,1
				},
				{2,3

				},
				{3,2

				}
		};

		System.out.println(b.isBoomerang(arr));

	}

}
