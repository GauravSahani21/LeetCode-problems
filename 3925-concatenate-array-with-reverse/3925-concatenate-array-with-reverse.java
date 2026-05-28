class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;

        int [] newArr = new int[n*2];

        for(int i=0; i<n; i++){
            newArr[i] = nums[i];
        }

        int k=n;
        for(int i=n-1; i>=0; i--){
            newArr[k]=nums[i];
            k++;
        }
        return newArr;
    }
}