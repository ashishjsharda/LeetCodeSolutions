class MissingNum {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = n * (n + 1) / 2; // Sum of all numbers from 0 to n
        int arraySum = 0;
        
        for (int num : nums) {
            arraySum += num; // Summing up the elements in the array
        }
        
        
        return totalSum - arraySum;
    }
}
