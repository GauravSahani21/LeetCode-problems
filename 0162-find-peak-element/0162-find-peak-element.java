class Solution {
    public int findPeakElement(int[] nums) {
       int largest = nums[0];
       int pos=0;

       for(int i=1; i<nums.length; i++){
            if(nums[i] > largest){
                largest = nums[i];
                pos = i;
            }
       }
       return pos;
    }
}