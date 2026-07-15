class Solution {
    public int findLucky(int[] arr) {
        int largest = -1;

        int[] hash = new int[501];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 1; i <= 500; i++) {
            if (hash[i] == i) {
                largest = i;
            }
        }

        return largest;
    }
}