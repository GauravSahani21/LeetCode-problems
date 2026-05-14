class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        rot(nums, 0, nums.length-1);
        rot(nums, 0, k-1);
        rot(nums, k, nums.length-1);
    }
    
    public int rot(int []nums, int low, int high){
        while(low<high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
        return 0;
    }
}