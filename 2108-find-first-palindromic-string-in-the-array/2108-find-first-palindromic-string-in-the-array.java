class Solution {
    public String firstPalindrome(String[] words) {
        

        for(int i=0; i<words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                String s=words[i];
                int start = 0;
                int end = words[i].length()-1;
                boolean b =true;

                while(start<end){
                    if(s.charAt(start) != s.charAt(end)){
                        b=false;
                    }

                    start++;
                    end--;
                }
                if(b==true){
                    return s;
                }
                
            }
        }
        return "";
    }
}