class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int sum=0;
        if(x<0){
            return false;
        }

        while(x!=0){
            int digit = x%10;
         sum = sum*10 + digit;
            x = x/10;
        }

        if(sum == n){
            return true;
        }
        return false;
    }
}