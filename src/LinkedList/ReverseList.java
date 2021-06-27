package LinkedList;

import java.util.Scanner;

public class ReverseList {

    Node head;
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

    public void reverse(){
        Node current = head;
        Node prev = null;
        Node next = null;

        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void show(){
        Node temp = head;
        if(temp==null){
            System.out.println("The list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseList rs = new ReverseList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of element of the list");
        int n = sc.nextInt();
        System.out.println("Enter List elements");
        for(int i=0;i<n;i++){
            rs.push(sc.nextInt());
        }
        rs.reverse();
        System.out.println("the reversed list is: ");
        rs.show();
    }
}
