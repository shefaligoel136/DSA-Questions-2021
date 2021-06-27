package LinkedList;

import java.util.Scanner;

public class MiddleNode {
    Node head = null;

    public void push(int data){
        Node temp_1 = head;
        if(temp_1==null){
            temp_1 = new Node(data,null);
            head = temp_1;
        }
        else{
            while(temp_1.next!=null){
                temp_1 = temp_1.next;
            }
            temp_1.next = new Node(data,null);
        }
    }
    public void middle(){
        Node slow_ptr = head;
        Node fast_ptr = head;

        while(slow_ptr!=null && fast_ptr.next!=null){
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        System.out.println("The middle element is: "+slow_ptr.value);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiddleNode list1 = new MiddleNode();

        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list1.push(num);
        }
        list1.middle();
    }
}
