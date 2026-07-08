class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);

        char [] ch = s.toCharArray();

        int count = 0;

        for(int i=0; i<ch.length; i++){
            if(ch[i] == '1'){
                count++;
            }
        }

        return count;
    }
}