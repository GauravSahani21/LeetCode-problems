class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> numbers = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            numbers.add(nums[i]);
        }

        for(int i=1; i<=1000; i++){
            if(i%k == 0 && !numbers.contains(i)){
                return i;
            }
        }
        return 0;
    }
}