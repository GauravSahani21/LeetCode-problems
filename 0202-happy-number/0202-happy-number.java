class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit);
                n = n / 10;
            }
            n = sum;
            sum = 0;
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }

    }
}