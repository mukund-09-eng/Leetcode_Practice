class Solution {
    public String reverseParentheses(String s) {
        StringBuilder current = new StringBuilder();
        Stack<String> st = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch=='('){
                st.push(current.toString());
                current.setLength(0);
            }
            else if(ch==')'){
                current.reverse();
                current.insert(0,st.pop());
            }
            else{
                current.append(ch);
            }
        }
        return current.toString();
    }
}