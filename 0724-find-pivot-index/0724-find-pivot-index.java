class Solution {
    public int pivotIndex(int[] nums) {
       int right_sum = 0;
       int left_sum =0;
       int n = nums.length;
        for(int i=0; i<n; i++){
            right_sum += nums[i];
        }
        for(int i=0; i<n; i++){
            right_sum -= nums[i];
            if(right_sum==left_sum){
                return i;
            }
            left_sum += nums[i];
        }
          return -1;
    }
}