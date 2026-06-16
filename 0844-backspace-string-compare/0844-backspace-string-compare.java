class Solution {
    String compare(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '#') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        String s1 = compare(s);
        String s2 = compare(t);

        return s1.equals(s2);
    }
}