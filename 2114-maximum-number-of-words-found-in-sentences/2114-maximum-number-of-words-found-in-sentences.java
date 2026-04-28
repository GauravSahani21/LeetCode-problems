class Solution {
    public int mostWordsFound(String[] s) {
        
    int count =0; 
    

    for (int i = 0; i < s.length; i++) {
        String[] words = s[i].split(" ");  
        
        if(words.length>count){
            count = words.length;
        }
        
    }
    return count;
    }
}