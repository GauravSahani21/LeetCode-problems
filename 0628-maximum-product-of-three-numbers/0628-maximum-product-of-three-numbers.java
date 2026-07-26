class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length-1;
        Arrays.sort(nums);

        int n1 = nums[n];
        int n2 = nums[n-1];
        int n3 = nums[n-2];

        int ans1 = n1*n2*n3;
        int ans2 = nums[0] * nums[1] * nums[n];

        if(ans1 > ans2){
            return ans1;
        }
        return ans2;
    }
}