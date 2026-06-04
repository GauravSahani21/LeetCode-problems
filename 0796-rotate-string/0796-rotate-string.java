class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        char[] ch = s.toCharArray();
        char[] ch1 = goal.toCharArray();
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            if (Arrays.equals(ch, ch1)) {
                return true;
            }
            rotate(ch, n);
        }
        return false;

    }

    void rotate(char[] ch, int n) {

        char temp = ch[n - 1];

        for (int i = n - 1; i > 0; i--) {
            ch[i] = ch[i - 1];
        }
        ch[0] = temp;
    }
}