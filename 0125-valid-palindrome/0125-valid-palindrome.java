class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();

        char [] ch = s.toCharArray();
        int low = 0;
        int high = ch.length-1;

        while(low< high){
            if(ch[low] != ch[high]){
                return false;
            }

            low++;
            high--;
        }
        return true;
    }
}