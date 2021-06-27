package LinkedList;

import java.util.Scanner;

public class NthNodeFromEnd{
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

    public void findNth(int n){
        Node temp_1 = head;
        Node temp_2 = head;
        if(temp_1==null){
            System.out.println("The list is empty");
            return;
        }
        if(n==0){
            System.out.println(temp_1.value);
            return;
        }
        int pos = 0;
        while(pos<n){
            temp_2 = temp_2.next;
            pos++;
        }
        while(temp_2!=null){
            temp_1 = temp_1.next;
            temp_2 = temp_2.next;
        }
        System.out.println(temp_1.value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NthNodeFromEnd list1 = new NthNodeFromEnd();

        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list1.push(num);
        }

        System.out.println("Enter position from last");
        int nth = sc.nextInt();
        list1.findNth(nth);
    }
}