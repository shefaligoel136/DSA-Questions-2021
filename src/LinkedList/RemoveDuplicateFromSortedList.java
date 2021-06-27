package LinkedList;

import java.util.Scanner;

public class RemoveDuplicateFromSortedList {
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

    public void removeDuplicate(){
        Node curr = head;
        while(curr!=null){
            Node temp = curr;
            while(temp!=null && curr.value==temp.value){
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
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

    public static void main(String[] args) {
        RemoveDuplicateFromSortedList rD = new RemoveDuplicateFromSortedList();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            rD.push(num);
        }
        rD.removeDuplicate();
        rD.show();
    }
}
