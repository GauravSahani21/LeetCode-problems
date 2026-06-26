class Solution {
    public int[] searchRange(int[] nums, int target) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr.add(i);

                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] == target) {
                        arr.add(j);
                        break;
                    }
                }

                if(arr.size()==1){
                    arr.add(i);
                }
                break;
            }

        }
        if(arr.size()==0){
            return new int []{-1,-1};
        }
        return new int[]{arr.get(0), arr.get(1)};

    }
}