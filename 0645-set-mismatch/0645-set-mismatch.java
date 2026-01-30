class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int ExpSum = n*(n+1)/2;
        int Sum =0;
        int ans=0;
        int missing = 0;

        for(int i=0;i<n;i++){
            Sum += nums[i];
        }
        ans= ExpSum - Sum;

        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                missing = ExpSum - Sum + nums[i];
                return new int[]{nums[i-1], missing};
            }
        }
         return new int[]{};
    }
}