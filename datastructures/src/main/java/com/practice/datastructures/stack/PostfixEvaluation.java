package com.practice.datastructures.stack;

import java.util.Stack;

public class PostfixEvaluation {
    // Expression example: "231*+9-"
    // Postfix Expression Explained: https://www.geeksforgeeks.org/evaluation-of-postfix-expression/
    public int EvaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        
        // for each character in the expression
        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // https://stackoverflow.com/questions/4318263/java-subtract-0-from-char-to-get-an-int-why-does-this-work
            } else {
                int val1 = stack.pop(); // pop removes and returns the last-in-first-out item from the top of the stack
                int val2 = stack.pop();
                
                switch (ch) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
