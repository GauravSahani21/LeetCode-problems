class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        
        List<Boolean> b = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int sum = extraCandies;

            sum += candies[i];

            if (sum >= max) {
                b.add(true);
            } else {
                b.add(false);
            }

        }
        return b;
    }
}