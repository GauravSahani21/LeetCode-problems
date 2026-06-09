class Solution {
    public int[] scoreValidator(String[] events) {
        int[] ans = new int[2];

        for (int i = 0; i < events.length; i++) {
            if(ans[1] == 10) break;
            if (events[i].equals("W")) {
                if (ans[1] == 10) {
                    ans[0]=0;
                    break;
                }
                ans[1] += 1;
            } else if (events[i].equals("WD") || events[i].equals("NB")) {
                ans[0] += 1;
            } else {
                ans[0] += Integer.parseInt(events[i]);
            }
        }
        return ans;
    }
}