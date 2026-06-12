class Solution {
    public int mySqrt(int x) {

        long low = 0;
        long high = x;
        long a = 0;

        while (low <= high) {
            long mid = (low+high)/2;

            if(mid*mid <= x){
                a = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return (int)a;
    }
}