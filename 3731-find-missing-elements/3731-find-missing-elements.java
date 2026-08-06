class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = smallest + 1; i < largest; i++) {
            boolean b = false;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    b = true;
                }
            }

            if (!b) {
                arr.add(i);
            }
        }

        return arr;
    }
}