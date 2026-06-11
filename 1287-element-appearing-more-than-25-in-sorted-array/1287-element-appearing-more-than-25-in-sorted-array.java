class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int [] hash = new int[10000000];
        for(int i=0; i<n; i++){
            hash[arr[i]]++;
        }
       for(int i=0; i<hash.length; i++){
            if(hash[i] > (n/4)){
                return i;
            }
       }
       return -1;
    }
}