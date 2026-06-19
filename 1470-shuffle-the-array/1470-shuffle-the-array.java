class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        int[] ans = new int[nums.length];

        for (int i = 0; i < n; i++) {
            arr1[i] = nums[i];
        }

        for (int i = n; i < nums.length; i++) {
            arr2[i - n] = nums[i];
        }

        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            ans[a] = arr1[i];
            ans[b] = arr2[i];

            a += 2;
            b += 2;
        }

        return ans;
    }
}