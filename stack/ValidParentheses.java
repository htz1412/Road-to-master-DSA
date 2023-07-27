/*
 * Problem Link : https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150
 */

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' ||
                s.charAt(i) == '[' ||
                s.charAt(i) == '{'
            ) {
                stack.push(s.charAt(i));
            } else if (stack.empty()) {
                return false;
            } else {
                Character poppedElement = stack.pop();
                if (poppedElement == '(' && s.charAt(i) != ')' ||
                    poppedElement == '[' && s.charAt(i) != ']' ||
                    poppedElement == '{' && s.charAt(i) != '}'
                )
                    return false;
            }
        }

        return stack.empty();
    }
}
