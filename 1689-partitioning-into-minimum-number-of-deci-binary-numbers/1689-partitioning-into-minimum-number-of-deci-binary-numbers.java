class Solution {
    public int minPartitions(String n) {
        int ans =0;

        for(int i=0; i<n.length(); i++){
            int digit = n.charAt(i) - '0';

            if(digit>ans){
                ans = digit;
            }

        }

        return ans;
    }
}