class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length-1;
        int sum = 0;

        while(low<high){
            sum = nums[low] + nums[high];
            if(sum == target){
                return new int[]{low, high};
            }else if(sum < target){
                low++;
            }else{
                high--;
            }
        }
        return new int[]{};
    }
}