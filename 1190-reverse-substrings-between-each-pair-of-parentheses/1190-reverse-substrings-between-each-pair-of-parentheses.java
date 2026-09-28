class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char ch  = s.charAt(i);

            if(ch == ')'){
                String s2 = "";

                while(stack.peek() != '('){
                    s2 += stack.pop();
                }
                stack.pop();

                for(int j=0; j<s2.length(); j++){
                    stack.push(s2.charAt(j));
                }

            }else{
                stack.push(ch);
            }
        }

        String ans="";
        
        for(int i=0; i<stack.size(); i++){
            ans += stack.get(i);
        }
        return ans;
    }
}