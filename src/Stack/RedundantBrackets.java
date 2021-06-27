package Stack;

import java.util.Scanner;
import java.util.Stack;

public class RedundantBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression");
        String exp = sc.nextLine();
        System.out.println(checkRed(exp));
    }

    public static boolean checkRed(String exp){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<exp.length();i++){
            char e = exp.charAt(i);
            if(e == ')'){
                char top = stack.peek();
                stack.pop();

                boolean flag = true;
                while(top!='('){
                    if(top == '+' || top == '-' || top == '*' || top == '/'){
                        flag = false;
                    }
                    top = stack.peek();
                    stack.pop();
                }

                if(flag){
                    return true;
                }


            }else{
                stack.push(e);
            }
        }
        return false;
    }

}

