class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int ans2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                ans++;

                if (ans > ans2) {
                    ans2 = ans;
                }
            } else {
                ans = 0;
            }
        }
        return ans2;
    }
}