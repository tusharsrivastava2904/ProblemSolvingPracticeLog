package ProblemSolving.GFG;

import java.util.Scanner;
import java.util.Stack;

/*
 * Check the balance of parenthesis.
 * */

public class ParenthesisChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(isBalanced(str));
    }

    private static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch: str.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else {
                if(stack.empty()) return false;
                else{
                    char top = stack.peek();
                    if((top =='[' && ch==']') ||
                            (top == '{' && ch=='}') ||
                            (top == '(' && ch==')')){
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        if (stack.isEmpty()) return true;

        return false;
    }

}
