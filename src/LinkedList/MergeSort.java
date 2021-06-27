package LinkedList;

import java.util.Scanner;

public class MergeSort {


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

    public static GenericNode<Integer> mergeSort(GenericNode<Integer> head){

        if(head == null || head.next==null){
            return head;
        }

        GenericNode<Integer> slow = head;
        GenericNode<Integer> fast = head;

        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        GenericNode<Integer> temp = slow.next;
        slow.next = null;

        GenericNode<Integer> left = mergeSort(head);
        GenericNode<Integer> right = mergeSort(temp);
        GenericNode<Integer> sorted = merge(left,right);
        return  sorted;
    }

    public static GenericNode<Integer> merge(GenericNode<Integer> head1, GenericNode<Integer> head2){
        GenericNode<Integer> head = null;
        if(head1 == null){
            return head2;
        }
        if(head2 == null){
            return head1;
        }

        if(head1.data < head2.data){
            head = head1;
            head.next = merge(head1.next,head2);
        }else{
            head = head2;
            head.next = merge(head1,head2.next);
        }

        return head;
    }

    public static void main(String[] args) {
        GenericNode<Integer> list = takeInput();
        GenericNode<Integer> sorted = mergeSort(list);
        printList((sorted));
    }
}
