class Solution {
    public int findMin(int[] nums) {
        int n = 999999;

        for(int i=0; i<nums.length; i++){
            n = Math.min(n, nums[i]);
        }
        return n;
    }
}