class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int [] hash = new int[10001];
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(hash[nums[i]] < k){
                hash[nums[i]]++;
                arr.add(nums[i]);
            }
        }

        int [] ans = new int[arr.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }
}