class Solution {
    public String[] findWords(String[] words) {
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            boolean b1 = true;
            boolean b2 = true;
            boolean b3 = true;

            for (int j = 0; j < words[i].length(); j++) {
                char ch = Character.toLowerCase(words[i].charAt(j));

                if (s1.indexOf(ch) == -1) {
                    b1 = false;
                }
                if (s2.indexOf(ch) == -1) {
                    b2 = false;
                }
                if (s3.indexOf(ch) == -1) {
                    b3 = false;
                }
            }
            if (b1 || b2 || b3) {
                ans.add(words[i]);
            }
           
        }
        return ans.toArray(new String[0]);
    }
}