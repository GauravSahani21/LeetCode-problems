class Solution {
    public int countPrimes(int num) {
        if(num == 0 || num == 1){
            return 0;
        }
        
        boolean[] prime = new boolean[num];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= num; i++) {
            if (prime[i]) {
                for (int j = i * i; j < num; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i=2; i<num; i++){
            if(prime[i]){
                count++;
            }
        }
        return count;
    }
}