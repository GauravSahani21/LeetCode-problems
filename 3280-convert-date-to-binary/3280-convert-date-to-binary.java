class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int da = Integer.parseInt(parts[2]);

        String yearB = Integer.toBinaryString(year);
        String monthB = Integer.toBinaryString(month);
        String daB = Integer.toBinaryString(da);

        String ans = yearB + '-' + monthB + '-' + daB;

        return ans;
    }
}