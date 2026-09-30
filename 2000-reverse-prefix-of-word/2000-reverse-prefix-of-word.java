class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int index = word.indexOf(ch);

        if(index == -1) return word;

        int low = 0;
        int high = index;
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

        return new String(arr);
    }
}