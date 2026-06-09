class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long low  = Integer.MAX_VALUE;
        long high = Integer.MIN_VALUE;

        for(int i=0; i<nums.length; i++){
            low = Math.min(nums[i], low);
            high = Math.max(nums[i], high);
        }

        long ans= high - low;

        return ans * k;
    }
}