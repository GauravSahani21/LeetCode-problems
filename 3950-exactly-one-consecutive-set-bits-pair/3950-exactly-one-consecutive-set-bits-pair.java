class Solution {
    public boolean consecutiveSetBits(int n) {
        String s = Integer.toBinaryString(n);
        boolean found = false;

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) == '1' && s.charAt(i - 1) == '1') {

                if (found) {
                    return false;
                }
                found = true;
            }

        }
        return found;
    }
}