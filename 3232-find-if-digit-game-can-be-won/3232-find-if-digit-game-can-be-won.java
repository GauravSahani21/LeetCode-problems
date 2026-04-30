class Solution {
    public boolean canAliceWin(int[] nums) {
        int Alice =0;
        int Bob =0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<10){
                Alice += nums[i];
            }else{
                Bob += nums[i];
            }
        }
        return Alice != Bob;
    }
}