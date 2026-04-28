class Solution {
    public int differenceOfSums(int n, int m) {
        int []nums = new int[n];

        int divisible = 0;
        int notdivible = 0;

        for(int i=0; i<n; i++){
            nums[i]=i+1; 
        }

        for(int i=0; i<n; i++){
            if(nums[i]%m==0){
                divisible += nums[i];
            }else{
                notdivible += nums[i];
            }
        }
        return notdivible-divisible;

    }
}