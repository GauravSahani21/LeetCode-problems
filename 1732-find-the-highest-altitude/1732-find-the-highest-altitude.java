class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0;
        int highest = 0;

        for(int i=0; i<gain.length; i++){
            ans += gain[i];

            if(ans>highest){
                highest = ans;
            }
        }
        
        return highest;
    }
}