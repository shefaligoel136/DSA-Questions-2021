package Stack;

import java.util.Scanner;
import java.util.Stack;

public class MinBracketReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String exp = sc.nextLine();
        System.out.println(bracRev(exp));
    }

    public static int bracRev(String exp){
        int len = exp.length();
        if(len%2!=0){
            return -1;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<len;i++){
            char c = exp.charAt(i);
            if(c == '}' && !stack.empty()){
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }else{
                stack.push(c);
            }
        }
        int reduced_len = stack.size();
        int n = 0;
        while(!stack.isEmpty() && stack.peek() == '{'){
            stack.pop();
            n++;
        }
        return (reduced_len/2 + n%2);
    }
}
