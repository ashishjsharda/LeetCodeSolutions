class Solution {
    public int boxDelivering(int[][] boxes, int portsCount, int maxBoxes, int maxWeight) {
        int n = boxes.length;
        int[] dp = new int[n + 1]; // Minimum number of trips to deliver the first i boxes
        long weight = 0; // Current weight of boxes on the ship
        int trips = 0; // Number of trips needed
        int left = 0; // Left pointer for the sliding window
        
        for (int right = 0; right < n; right++) {
            // Add the current box to the ship
            weight += boxes[right][1];
            
            // If it's the first box or a different port, increment the trip count
            if (right == 0 || boxes[right][0] != boxes[right - 1][0]) {
                trips++;
            }
            
            while (right - left + 1 > maxBoxes || weight > maxWeight || (left < right && dp[left] == dp[left + 1])) {
                weight -= boxes[left][1];
                if (boxes[left][0] != boxes[left + 1][0]) {
                    trips--;
                }
                left++;
            }
            
            // Update the table with the minimum trips needed to deliver up to the current box
            dp[right + 1] = trips + dp[left] + 1; // +1 for the return trip to storage
        }
        
        // Return the minimum number of trips needed to deliver all boxes
        return dp[n];
    }
}
