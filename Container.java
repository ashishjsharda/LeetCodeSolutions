/**
 * Container With Most Water
 * <a href="https://leetcode.com/problems/container-with-most-water/"> LeetCode</a>
 * @author ashish
 */
public class Container {
    public int maxArea(int[] height) {
        int res = 0, n = height.length;
        int l = 0, r = n - 1;
        while (l < r) {
            int h = 0, sum = 0;
            if (height[l] < height[r]) {
                h = height[l];
                sum = h * (r - l);
                l++;
            } else {
                h = height[r];
                sum = h * (r - l);
                r--;
            }
            res = Math.max(res, sum);
        }
        return res;
    }
}
