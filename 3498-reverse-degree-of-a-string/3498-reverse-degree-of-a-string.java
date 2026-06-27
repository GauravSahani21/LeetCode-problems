class Solution {
    public int reverseDegree(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = 'z' - s.charAt(i) + 1;
            ans += digit * (i+1);
        }
        return ans;
    }
}