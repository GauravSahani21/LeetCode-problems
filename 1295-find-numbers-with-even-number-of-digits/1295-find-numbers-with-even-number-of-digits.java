class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length; 
        int [] ans = new int[n];
        int anss=0;
        for(int i=0; i<n; i++){
            int count=0;

            while(nums[i]>0){
                count++;
                nums[i] /= 10;
            }
            ans[i] = count;

            if(ans[i] %2==0){
                anss++;
            }
        }
        return anss;
    }
}