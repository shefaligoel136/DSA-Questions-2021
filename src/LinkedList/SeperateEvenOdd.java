package LinkedList;

import java.util.Scanner;

public class SeperateEvenOdd {
    Node head = null;

    public void push(int data){
        Node temp = head;
        if(temp==null){
            temp = new Node(data,null);
            head = temp;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = new Node(data,null);
        }
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

    // ----- METHOD 1-----
    public void seperate(){
        Node end = head;
        while(end.next!=null){
            end = end.next;
        }
        Node new_end = end;

        Node curr = head, prev = null;
        while (curr != end && curr.value%2!=0)  {
            new_end.next = curr;
            curr = curr.next;
            new_end.next.next = null;
            new_end = new_end.next;
        }
        if(curr.value%2==0){
            head = curr;
            while(curr!=end){
                if(curr.value%2==0){
                    prev = curr;
                    curr = curr.next;
                }
                else{
                    prev.next = curr.next;
                    curr.next = null;
                    new_end.next = curr;
                    new_end = curr;
                    curr = prev.next;
                }
            }
        }
        else prev = curr;

        if (new_end != end && end.value %2 != 0)
        {
            prev.next = end.next;
            end.next = null;
            new_end.next = end;
        }
    }

    /* -----  METHOD 2-----

    public void seperate() {
        SeperateEvenOdd list1 = new SeperateEvenOdd();
        SeperateEvenOdd list2 = new SeperateEvenOdd();
        Node temp1 = head;
        while (temp1 != null) {
            if (temp1.value % 2 != 0) {
                list1.push(temp1.value);
            }
            else if(temp1.value % 2 == 0) {
                list2.push(temp1.value);
            }
            temp1 = temp1.next;
        }
        Node list2Head = list2.head;
        while(list2Head.next!=null){
            list2Head = list2Head.next;
        }
        list2Head.next = list1.head;
        list1.show();
        list2.show();
    }*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        SeperateEvenOdd list = new SeperateEvenOdd();

        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            list.push(num);
        }
        list.seperate();
        list.show();
    }
}
