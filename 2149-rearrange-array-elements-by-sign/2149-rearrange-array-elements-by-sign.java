class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] pos = new int[nums.length/2];
        int [] neg = new int[nums.length/2];

        int [] ans = new int[nums.length];

       
        int p=0, n=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                pos[p++] = nums[i];
            }else{
                neg[n++] = nums[i];
            }
            
        }

        int j=0;
        for(int i=0; i<nums.length/2; i ++){
            ans[j++] = pos[i];
            ans[j++] = neg[i];
        }

        return ans;
    }
}