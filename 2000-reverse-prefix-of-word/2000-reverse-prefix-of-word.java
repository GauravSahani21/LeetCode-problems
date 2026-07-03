class Solution {
    public String reversePrefix(String word, char ch) {
        if (word.indexOf(ch) == -1)
            return word;

        Stack<Character> st = new Stack<>();
        int i = 0;
        while (word.charAt(i) != ch) {
            st.push(word.charAt(i));
            i++;
        }

        StringBuilder ans = new StringBuilder();
        ans.append(ch);

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        for (int j = i + 1; j < word.length(); j++) {
            ans.append(word.charAt(j));
        }

        return ans.toString();
    }
}