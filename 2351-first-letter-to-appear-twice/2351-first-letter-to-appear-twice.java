class Solution {
    public char repeatedCharacter(String s) {
        char [] ch = new char[1];

        for(int i=0; i<s.length(); i++){
            for(int j=0; j<i; j++){
                if(s.charAt(i)==s.charAt(j)){
                    ch[0] = s.charAt(i);
                    return ch[0];
                }
            }
        }
        return ' ';
    }
}