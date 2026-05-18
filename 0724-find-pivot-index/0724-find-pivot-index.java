class Solution {
    public int pivotIndex(int[] nums) {
        int left_sum = 0;
        int right_sum = 0;

        for(int i=0; i<nums.length;i++){
            right_sum += nums[i];
        }

        for(int i=0; i<nums.length; i++){
            left_sum += nums[i];

            if(left_sum == right_sum){
                return i;
            }else{
                right_sum -= nums[i];
            }
        }

        return -1;
    }
}