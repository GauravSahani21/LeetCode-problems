class Solution {
    public int mostFrequentEven(int[] nums) {
        int [] hash = new int[100001];

        int ans = -1;
        int max=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
               hash[nums[i]]++;
            }
        }
        for(int i=0; i<hash.length; i++){
            if(hash[i]>max){
                ans=i;
                max = hash[i];
            }
            i++;
        }

        
    return ans;
    }
}