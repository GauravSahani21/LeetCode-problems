
class Solution {
    public String processStr(String s) {
        ArrayList<Character> ans = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                ans.add(s.charAt(i));
            } else if (s.charAt(i) == '*') {
                if (!ans.isEmpty()) {
                    ans.remove(ans.size() - 1);
                }
            } else if (s.charAt(i) == '#') {
                ans.addAll(new ArrayList<>(ans));
            } else if (s.charAt(i) == '%') {
                Collections.reverse(ans);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : ans) {
            result.append(c);
        }
        return result.toString();
    }
}