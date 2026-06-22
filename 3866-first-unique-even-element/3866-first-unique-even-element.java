class Solution {
    public int firstUniqueEven(int[] nums) {
        int [] hash = new int[100001];

        for(int i=0; i<nums.length; i++){
            hash[nums[i]]++;
        }

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2 == 0 && hash[nums[i]] == 1){
                return nums[i];
            }
        }
        return -1;
    }
}