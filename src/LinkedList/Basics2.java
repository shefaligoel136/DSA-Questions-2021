package LinkedList;

import java.util.Scanner;

public class Basics2 {

    public static GenericNode<Integer> createLinkedList(){
        GenericNode<Integer> n1 = new GenericNode<>(10);
        GenericNode<Integer> n2 = new GenericNode<>(20);
        GenericNode<Integer> n3 = new GenericNode<>(30);
        GenericNode<Integer> n4 = new GenericNode<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }

    public static void printList(GenericNode<Integer> n){
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static void increment1(GenericNode<Integer> n){
        while(n!=null) {
            n.data = n.data + 1;
            n = n.next;
        }
    }

    public static GenericNode<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        GenericNode<Integer> head = null;
        while(data != -1) {
            GenericNode<Integer> currentNode = new GenericNode<Integer>(data);
            if (head == null) {
                head = currentNode;
            } else {
                GenericNode<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = currentNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static GenericNode<Integer> takeInput2(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        GenericNode<Integer> head = null;
        GenericNode<Integer> tail = null;
        while(data != -1) {
            GenericNode<Integer> currentNode = new GenericNode<Integer>(data);
            if (head == null) {
                head = currentNode;
                tail = head;
            } else {
                tail.next = currentNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static GenericNode<Integer> insert(int num,int pos,GenericNode<Integer> head){
//        10->20->30->40->50  n=0,4
        GenericNode<Integer> temp = head;
        int n = 0;

        if(pos==0){
            GenericNode<Integer> temp1 = new GenericNode<Integer>(num);
            temp1.next = head;
            head = temp1;
        }else{
            while(n != pos-1 && temp!=null){
                temp = temp.next;
                n++;
            }
            if(temp!=null){
                GenericNode<Integer> temp1 = temp.next;
                temp.next = new GenericNode<Integer>(num);
                temp = temp.next;
                temp.next = temp1;
            }

        }


        return head;
    }


    public static void main(String[] args) {
//        GenericNode<Integer> n = createLinkedList();
//        printList(n);
//        increment1(n);
//        System.out.println("After increment");
//        printList(n);
//        GenericNode<Integer> n = takeInput();
//        printList(n);
        GenericNode<Integer> n2 = takeInput2();
//        printList(n2);
        GenericNode<Integer> n3 = insert(45,0,n2);
        printList(n3);
    }
}
