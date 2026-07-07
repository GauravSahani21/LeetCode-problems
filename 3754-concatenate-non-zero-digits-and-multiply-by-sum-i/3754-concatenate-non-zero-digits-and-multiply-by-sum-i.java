class Solution {
    public long sumAndMultiply(int n) {
        int temp = n;
        long x = 0;
        long sum = 0;

        long carry = 1;

        while (temp > 0) {
            long digit = temp % 10;
            if (digit > 0) {
                sum += digit;
                x = x + (digit * carry);
                carry *= 10;
            }
            temp /= 10;
        }
        return x * sum;
    }
}