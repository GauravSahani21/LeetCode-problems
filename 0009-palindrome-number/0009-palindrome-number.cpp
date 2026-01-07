class Solution {
public:
    bool isPalindrome(int x) {
        int n=x;
        __int128 rev=0;
        while(x>0){
            int ld=x%10;
            x=x/10;
            rev=(rev*10)+ld;
        }
        if(n==rev){
            return true;
        }else{
            return false;
        }
    }
};