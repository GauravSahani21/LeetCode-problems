class Solution {
    void rotate(int low, int high, char [] ch){
        while(low<high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;

            low++;
            high--;
        }
    }
    public String reversePrefix(String s, int k) {
        char [] ch = s.toCharArray();

        rotate(0, k-1, ch);

        return new String(ch);
    }
}