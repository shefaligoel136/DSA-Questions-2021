package LinkedList;

import java.util.Scanner;

public class MergeTwo {

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

    public static GenericNode<Integer> mergeList(GenericNode<Integer> l1, GenericNode<Integer> l2){
        GenericNode<Integer> head = null;
        GenericNode<Integer> temp = null;
        while(l1 != null && l2 != null){
            if(l1.data>l2.data){
                GenericNode<Integer> currentNode = new GenericNode<Integer>(l1.data);
                if(head == null){
                    head = currentNode;
                    l1 = l1.next;
                    temp = head;
                }else{
                    temp.next = currentNode;
                    temp = temp.next;
                }
            }else{
                GenericNode<Integer> currentNode = new GenericNode<Integer>(l2.data);
                if(head == null){
                    head = currentNode;
                    l2 = l2.next;
                    temp = head;
                }else{
                    temp.next = currentNode;
                    temp = temp.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        GenericNode<Integer> l1 = takeInput();
        GenericNode<Integer> l2 = takeInput();

        GenericNode<Integer> l = mergeList(l1,l2);
    }
}
