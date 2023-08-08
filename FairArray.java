class FairArray {
    public int waysToMakeFair(int[] arr) {
        int n = arr.length;

        int even[] = new int[n];
        int odd[] = new int[n];

        even[0] = arr[0];
        odd[0] = 0;

        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) even[i] = even[i - 1] + arr[i];
            else even[i] = even[i - 1];
        }

        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) odd[i] = odd[i - 1] + arr[i];
            else odd[i] = odd[i - 1];
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int evenSum;
            int oddSum;

            if (i == 0) {
                evenSum = odd[n - 1];
                oddSum = even[n - 1] - even[0];
            } else {
                evenSum = even[i - 1] + odd[n - 1] - odd[i];
                oddSum = odd[i - 1] + even[n - 1] - even[i];
            }

            if (oddSum == evenSum) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        
        FairArray solution = new FairArray();
        int[] arr = {2, 1, 6, 4};
        int result = solution.waysToMakeFair(arr);
        System.out.println("Number of ways to make the array fair: " + result);
    }
}
