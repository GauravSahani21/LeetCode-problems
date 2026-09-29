class Solution {
    public boolean isThree(int n) {
        int count = 1;

        for(int i=n/2; i>=1 ;i--){
            if(n%i == 0){
                 count++;
            }
        }

        return (count == 3);

    }
}