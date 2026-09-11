class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count =0;
        int[] nums3 = new int[nums1.length + nums2.length];

        for(int i=0; i<nums1.length; i++){
            nums3[i]=nums1[i];
            count++;
        }
        for(int j=0; j<nums2.length; j++){
            nums3[j+count]=nums2[j];
        }
        Arrays.sort(nums3);

        int s = nums3.length;

        if(s%2==1){
            return nums3[s/2];
        }else{
            return (nums3[s/2] + nums3[s / 2-1])/ 2.0;
        }
    }
}