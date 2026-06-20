class Solution {
    public int maxProduct(int[] nums) {
        int max = 1;
        int prod = 1;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                max = (nums[i]-1)*(nums[j]-1);

                prod = Math.max(prod, max);
            }
        }
        if(prod == 1){
            return 0;
        }
        return prod;
    }
}