class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] hash = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'b' || ch == 'a' || ch == 'l' || ch == 'o' || ch == 'n') {
                hash[ch - 'a']++;
            }
        }

        int b = hash['b'-'a'];
        int a = hash['a'-'a'];
        int l = hash['l'-'a']/2;
        int o = hash['o'-'a']/2;
        int n = hash['n'-'a'];

        int result = b;

        result = Math.min(result, a);
        result = Math.min(result, l);
        result = Math.min(result, o);
        result = Math.min(result, n);

        return result;
    }
}