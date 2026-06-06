class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        
        int ch1 = prices[0];
        int ch2 = prices[1];

        if(ch1+ch2 <= money){
            return money - (ch1+ch2);
        }
        


        return money;
    }
}