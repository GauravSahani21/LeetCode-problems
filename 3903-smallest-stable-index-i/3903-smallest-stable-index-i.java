class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            for (int f = i; f < nums.length; f++) {
                min = Math.min(min, nums[f]);
            }

            if (max - min <= k) {
                return i;
            }

        }
        return -1;
    }
}