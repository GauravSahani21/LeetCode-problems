class Solution {
    public int pivotIndex(int[] arr) {
        int right_sum =0;
        int left_sum=0;

        for(int i=0; i<arr.length; i++){
            right_sum += arr[i];
        }

        for(int i=0; i<arr.length; i++){
            left_sum += arr[i];

            if(left_sum == right_sum){
                return i;
            }else{
                right_sum -= arr[i];
            }
        }
        return -1;
    }
}