class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ExpectedSum = n*(n+1)/2;
        int sum = 0;
        int ans=0;

        for(int i=0; i<n; i++){
            sum += nums[i];
        }

        ans = ExpectedSum - sum;
        return ans;
    }
}