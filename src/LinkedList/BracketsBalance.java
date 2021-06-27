package LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class BracketsBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your expression");
        String exp = sc.nextLine();
        System.out.println(isBalanced(exp));
    }

    public static boolean isBalanced(String exp) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char brac = exp.charAt(i);
            if (brac == '{' || brac == '[' || brac == '(') {
                stack.push(brac);
            } else if (!stack.isEmpty()) {
                if (brac == '}' && stack.peek() == '{') {
                    stack.pop();
                } else if (brac == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (brac == ')' && stack.peek() == '(') {
                    stack.pop();
                }else{
                    break;
                }
            }

        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}


