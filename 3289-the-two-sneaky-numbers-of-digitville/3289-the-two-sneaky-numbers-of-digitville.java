class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] hash = new int[6001];
        int[] ans = new int[2];
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            hash[nums[i]]++;

            if (hash[nums[i]] == 2) {
                ans[k] = nums[i];
                k++;
            }
        }

        return ans;
    }
}