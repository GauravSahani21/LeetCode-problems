class Solution {
    public void rotate(int[] nums, int k) {

          k = k % nums.length;

        roti(nums, 0, nums.length-1);
        roti(nums, 0, k-1);
        roti(nums, k, nums.length-1);
    }
    
    public int roti(int []nums, int low, int high){
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