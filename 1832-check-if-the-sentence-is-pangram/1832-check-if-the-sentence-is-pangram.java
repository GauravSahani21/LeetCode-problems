class Solution {
    public boolean checkIfPangram(String s) {
        boolean [] seen = new boolean[26];

        for(int i=0; i<s.length(); i++){
            int ch  = s.charAt(i)-'a';
            seen[ch] = true;
        }

        for(int i=0; i<26; i++){
            if(!seen[i]){
                return false;
            }
        }
        return true;
    }
}