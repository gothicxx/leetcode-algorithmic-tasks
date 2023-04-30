package arroganteIT.leetCode.validParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char symbol : s.toCharArray()) {
            if (symbol == '(' || symbol == '{' || symbol == '[') {
                stack.push(symbol);
            }else if (symbol == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            }else if (symbol == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            }else if (symbol == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            }else {
                return false;
            }
        }
        return stack.empty();
    }
}
