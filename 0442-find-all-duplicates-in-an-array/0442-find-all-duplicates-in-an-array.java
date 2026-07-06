class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();

        int [] hash = new int[1000000];

        for(int i=0; i<nums.length; i++){
            hash[nums[i]]++;
        }

        for(int i=0; i<hash.length; i++){
            if(hash[i] >1){
                arr.add(i);
            }
        }
        return arr;
    }
}