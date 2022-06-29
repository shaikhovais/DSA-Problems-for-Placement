//https://leetcode.com/problems/valid-parentheses/

class Solution {
    public boolean isValid(String str) {
        Stack <Character> st = new Stack<>();
        int len = str.length();
        
        for(int i = 0; i < len; i++) {
            
            char ch = str.charAt(i);
            //Check if ch is a openeing bracket
            if(isOpenParenthesis(ch)) {
                st.push(ch);
            } else if (!st.isEmpty()) {
                
                //If ch is a closing bracket then check if it matches with the top element of stack. If true then continue or else return false
                if(st.pop() == getOpenParenthesis(ch)) {
                    continue;
                } else {
                    return false;
                }
            } else {
                
                //If stack is empty then we return false
                return false;
            }
        }
        
        //Once we comeout of loop, check if stack is empty. If it's empty then the parenthesis were valid and return true
        if(st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    
    //function to check if it's a open parenthesis
    public boolean isOpenParenthesis(char ch) {
        if(ch == '(' || ch == '[' || ch == '{') {
            return true;
        }
        return false;
    }
    
    //function to get the opening pair of the ch
    public char getOpenParenthesis(char ch) {
        if(ch == ')' ) {
            return '(';
        }
        if(ch == ']' ) {
            return '[';
        }
        if(ch == '}' ) {
            return '{';
        }
        return 'a';
    }
}