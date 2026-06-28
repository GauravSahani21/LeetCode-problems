class Solution {
     boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }

        int start = Math.min(n, rev);
        int end = Math.max(n, rev);

        for(int i=start; i<=end; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }
}