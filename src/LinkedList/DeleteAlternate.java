package LinkedList;

import java.util.Scanner;

public class DeleteAlternate {

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

    public void delete(){
        Node temp =  head;
        while(temp.next!=null && temp.next.next!=null){
            temp.next = temp.next.next;
            temp = temp.next;
        }
        if(temp.next!=null){
            temp.next=null;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        DeleteAlternate list1 = new DeleteAlternate();

        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            list1.push(num);
        }
        list1.delete();
        list1.show();
    }
}
