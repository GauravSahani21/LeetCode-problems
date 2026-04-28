class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i=0; i<nums.length; i++){

            sum1 += nums[i];


            
                int x = nums[i];
                while(x>0){
                    int digit = x%10;
                    sum2 += digit;
                    x=x/10;
                }
            
                
        }
        return sum1-sum2;
    }
}