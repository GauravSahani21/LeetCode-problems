class Solution {
    public boolean checkIfPangram(String s) {
        boolean[] hash = new boolean[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']=true;
        }

        for(int i=0; i<26; i++){
            if(!hash[i]){
                return false;
            }
        }
        return true;
    }
}