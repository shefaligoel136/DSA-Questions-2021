package LinkedList;

import java.util.Scanner;

public class RecursiveSolutions {

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

    public static void printR(GenericNode<Integer> head){
        if(head == null){
            return;
        }
        // sequential
        System.out.println(head.data + " ");

        printR(head.next);

        // reverse
        //System.out.println(head.data + " ");
    }

    public static GenericNode<Integer> insertR(GenericNode<Integer> head, int n, int pos){

        if(head == null && pos>0){
            return head;
        }

        if(pos == 0){
            GenericNode<Integer> newNode = new GenericNode<Integer>(n);
            newNode.next = head;
            return  newNode;
        }else{
            GenericNode<Integer> smallNode = insertR(head.next,n,pos-1);
            head.next = smallNode;

            // head.next = insertR(head.next,n,pos-1);

            return head;
        }
    }

    public static GenericNode<Integer> deleteR(GenericNode<Integer> head, int pos){
        if(head == null && (pos==0 || pos>0)){
            return head;
        }
        if(pos == 0){
            return head.next;
        }else{
            GenericNode<Integer> smallNode = deleteR(head.next,pos-1);
            head.next = smallNode;
            return head;
        }
    }

    public static GenericNode<Integer> reverseR(GenericNode<Integer> head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            System.out.println("base case" + head.data);
            return head;
        }else{

            GenericNode<Integer> reverseNode = reverseR((head.next));
            head.next.next = head;
//            head.next = null;
            return reverseNode;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GenericNode<Integer> head = takeInput();

//        System.out.println("Enter element to insert and the position");
//        int n = sc.nextInt();
//        int pos = sc.nextInt();
//        GenericNode<Integer> newHead = insertR(head,n,pos);

//        System.out.println("Enter the position");
//        int pos = sc.nextInt();
//        GenericNode<Integer> newHead = deleteR(head,pos);

        GenericNode<Integer> newHead = reverseR(head);
        head.next = null;
//        GenericNode<Integer> newHead = checkR(head);
        printR(newHead);
    }
}
