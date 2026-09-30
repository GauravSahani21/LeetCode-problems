class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean [] b = new boolean[26];

        for(int i=0; i<sentence.length(); i++){
            b[sentences.charAt(i) - 'a'] = true;
        }

        for(int i=0; i<26; i++){
            if(!b[i]){
                return false;
            }
        }
    return true;
    }
}