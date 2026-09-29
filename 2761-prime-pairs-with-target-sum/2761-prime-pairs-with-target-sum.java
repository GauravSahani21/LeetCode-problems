class Solution {

    public List<List<Integer>> findPrimePairs(int num) {
        List<List<Integer>> ans = new ArrayList<>();
        if(num <= 1){
            return ans;
        }

        boolean[] prime = new boolean[num + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;

        for (int i = 2; i * i <= num; i++) {
            if (prime[i]) {
                for (int j = i * i; j < num; j += i) {
                    prime[j] = false;
                }
            }
        }

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                arr.add(i);
            }
        }

        int i = 0;
        int j = arr.size() - 1;

        while (i <= j) {
            int a = arr.get(i);
            int b = arr.get(j);

            if (a + b == num) {
                List<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(b);

                ans.add(list);

                i++;
                j--;
            } else if (a + b > num) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }
}