class Solution {
    public int findClosest(int x, int y, int z) {
        int stepx = Math.abs(x - z);
        int stepy = Math.abs(y - z);

        if (stepx < stepy) {
            return 1;
        } else if (stepy < stepx) {
            return 2;
        }

        return 0;
    }
}