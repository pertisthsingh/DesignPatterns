package ProblemSolving;

import java.util.Stack;

public class BalanceParenthesis {

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for(char ch : str.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                if(st.empty()) {
                    return false;
                }
                char topChar = st.pop();
                if( (ch == ')' && topChar != '(') || (ch == '}' && topChar != '{') || (ch == ']' && topChar != '[') ) {
                    return false;
                }
            }
        }
        return st.empty();
    }

    public static void main(String args[]) {
        System.out.println(BalanceParenthesis.isBalanced("[{()}]"));
    }
}
