class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        boolean [] freq = new boolean[26];

        for(int i=0; i<allowed.length(); i++){
            freq[allowed.charAt(i) - 'a'] = true;
        }

        int count =0;

        for(int i=0; i<words.length; i++){
            boolean valid = true;

            for(int j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);

                if(!freq[ch-'a']){
                    valid = false;
                    break;
                }
            }

            if(valid){
                count++;
            }
        }
            return count;
    }
}