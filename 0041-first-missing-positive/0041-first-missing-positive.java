class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            max = Math.max(max, nums[i]);
        }

        for (int i = 1; i <= max + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}