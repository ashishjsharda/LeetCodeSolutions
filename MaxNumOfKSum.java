import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> numFrequency = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int complement = k - num;
            if (numFrequency.containsKey(complement) && numFrequency.get(complement) > 0) {
                count++;
                numFrequency.put(complement, numFrequency.get(complement) - 1);
            } else {
                numFrequency.put(num, numFrequency.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3, 4};
        int k1 = 5;
        System.out.println("Example 1: " + solution.maxOperations(nums1, k1));

        int[] nums2 = {3, 1, 3, 4, 3};
        int k2 = 6;
        System.out.println("Example 2: " + solution.maxOperations(nums2, k2)); 
    }
}
