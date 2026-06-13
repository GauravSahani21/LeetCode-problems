class Solution {
    public int maxArea(int[] height) {
        int area = 0;

        int left = 0;
        int right = height.length - 1;

        int w = 0;
        int h = 0;

        while (left < right) {
            int max = 1;
            h = Math.min(height[left], height[right]);
            w = right - left;
            max = h * w;

            if (max > area) {
                area = max;
            }


            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            
        }
        return area;
    }
}