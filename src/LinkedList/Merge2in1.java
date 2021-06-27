package LinkedList;

import java.util.Scanner;

public class Merge2in1 {

    public static GenericNode<Integer> takeInput(){
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

    public static void printList(GenericNode<Integer> n){
        while(n!=null){
            System.out.println(n.data);
            n = n.next;
        }
    }

    public static GenericNode<Integer> mergeList(GenericNode<Integer> head1, GenericNode<Integer> head2){

        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        GenericNode<Integer> head = null;
        GenericNode<Integer> tail = null;
        GenericNode<Integer> t1 = head1;
        GenericNode<Integer> t2 = head2;

        if(t1.data <= t2.data){
            head = t1;
            tail = t1;
            t1 = t1.next;
        }else{
            head = t2;
            tail = t2;
            t2=t2.next;
        }

        while(t1!=null && t2!=null){
            if(t1.data <= t2.data){
                tail.next = t1;
                tail = tail.next;
                t1 = t1.next;
            }else{
                tail.next = t2;
                tail = tail.next;
                t2 = t2.next;
            }
        }

        if(t1!=null){
            tail.next = t1;
        }else{
            tail.next = t2;
        }

        return head;
    }

    public static void main(String[] args) {
        GenericNode<Integer> l1 = takeInput();
        GenericNode<Integer> l2 = takeInput();

        GenericNode<Integer> l = mergeList(l1,l2);
        printList(l);
    }

}
