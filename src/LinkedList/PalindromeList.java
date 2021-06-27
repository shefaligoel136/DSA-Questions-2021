package LinkedList;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeList {
    Node head;

    public void push(int data) {
        Node temp_1 = head;
        if (temp_1 == null) {
            temp_1 = new Node(data, null);
            head = temp_1;
        } else {
            while (temp_1.next != null) {
                temp_1 = temp_1.next;
            }
            temp_1.next = new Node(data, null);
        }
    }

    public void palindrome(){
        System.out.println("hi");
        Stack<Integer> s = new Stack<>();
        Node temp1 = head;
        Node temp2 = head;
        boolean isPalindrome = true;
        while(temp1!=null){
            s.push(temp1.value);
            temp1 = temp1.next;
        }
        while(!s.empty()){
            if(temp2.value==s.pop()){
                temp2 = temp2.next;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("The list is a palindrome");
        else
            System.out.println("The list is not a palindrome");
    }

    public static void main(String[] args) {
        PalindromeList pl = new PalindromeList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of element of the list");
        int n = sc.nextInt();
        System.out.println("Enter List elements");
        for (int i = 0; i < n; i++) {
            pl.push(sc.nextInt());
        }

        pl.palindrome();
    }
}
