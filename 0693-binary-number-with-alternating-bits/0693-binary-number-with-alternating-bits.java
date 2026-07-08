class Solution {
    public boolean hasAlternatingBits(int n) {
        String s = Integer.toBinaryString(n);

        char[] ch = s.toCharArray();

        for (int i = 1; i < ch.length; i++) {
            if (ch[i - 1] == ch[i]) {
                return false;
            }
        }
        return true;
    }

}