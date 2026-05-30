class Solution {
    public int mirrorDistance(int n) {
        int temp = n;
        int sum=0;
        while(temp>0){
            int digit = temp%10;
            sum = sum * 10 +digit;

            temp = temp/10;
        }
        int ans = sum - n;

        if(ans<0){
            ans *= -1;
        }
        return ans;
    }
}