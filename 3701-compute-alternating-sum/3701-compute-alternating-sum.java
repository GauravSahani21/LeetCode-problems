class Solution {
    public int alternatingSum(int[] nums) {
        int sum1=0;
        int sum2=0;

        for(int i=0; i<nums.length; i++){
            sum1 += nums[i];
            i++;
        }
        for(int i=1; i<nums.length; i++){
            sum2+= nums[i];
            i++;
        }

        return sum1 - sum2;
    }
}