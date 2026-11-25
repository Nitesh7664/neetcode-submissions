class Solution {

    int[] dp;
    public int helper(int[] nums, int idx) {
        if (idx >= nums.length - 1 || dp[idx] == 1) {
            return 1;
        }
        if (dp[idx] == 0 || nums[idx] == 0) {
            return dp[idx] = 0;
        }
        for (int i = idx + 1; i <= Math.min(idx + nums[idx], nums.length - 1); i++) {
            dp[i] = helper(nums, i);
            if (dp[i] == 1) {
                return dp[idx] = 1;
            }
        }
        return dp[idx] = 0;
    }

    public boolean canJump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, 0) == 1;
    }
}
