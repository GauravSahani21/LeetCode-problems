class Solution {
    public int maxFreqSum(String s) {
        s = s.toLowerCase();

        int count1 = 0;
        int count2 = 0;

        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (i+'a' == 'a' || i+'a' == 'e' || i+'a' == 'i' || i+'a' == 'o' || i+'a' == 'u') {
                if (hash[i] > count1) {
                    count1 = hash[i];
                }
            }else{
                if(hash[i]>count2){
                    count2 = hash[i];
                }
            }
        }

        return count1 + count2;
    }
}