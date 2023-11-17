import java.util.Arrays;

class MinMaxPairSum {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int minMaxPairSum = Integer.MIN_VALUE;

        for (int i = 0; i < n / 2; i++) {
            int pairSum = nums[i] + nums[n - 1 - i];
            minMaxPairSum = Math.max(minMaxPairSum, pairSum);
        }
        return minMaxPairSum;
    }

    public static void main(String[] args) {
        MinMaxPairSum minMaxPairSum = new MinMaxPairSum();
        int[] nums1 = {3, 5, 2, 3};
        System.out.println(minMaxPairSum.minPairSum(nums1)); // Output: 7
        int[] nums2 = {3, 5, 4, 2, 4, 6};
        System.out.println(minMaxPairSum.minPairSum(nums2)); // Output: 8
    }
}
