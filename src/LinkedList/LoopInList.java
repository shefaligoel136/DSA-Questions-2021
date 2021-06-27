package LinkedList;

import java.util.Scanner;

public class LoopInList {
    Node head;


    public void push(int data) {
        Node temp_1 = head;
        if (temp_1 == null) {
            temp_1 = new Node(data, null);
            head = temp_1;
        } else {
            while (temp_1.next != null) {
                temp_1 = temp_1.next;
            }
            temp_1.next = new Node(data, null);
        }

    }

    public void ifLoop(){
        head.next.next.next.next.next = head.next;
        Node slow = head;
        Node fast = head;
        boolean check = false;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                check = true;
                break;
            }
        }
        if (check) {
            System.out.println("Loop found");
            countLoop(slow);
        }
        else
            System.out.println("Loop not found");
    }

    public void countLoop(Node loopedNode){
        Node temp = head;
        int count = 0;
        while(temp!=loopedNode){
            count++;
            temp = temp.next;
        }
        System.out.println("The count is: "+count);
        removeLoop(loopedNode);
    }

    public void removeLoop(Node loopedNode){
        Node temp = head;
        while(temp!=loopedNode){
            temp = temp.next;
        }
        temp.next = null;
        show();
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
        LoopInList lil = new LoopInList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of element of the list");
        int n = sc.nextInt();
        System.out.println("Enter List elements");
        for (int i = 0; i < n; i++) {
            lil.push(sc.nextInt());
        }

        lil.ifLoop();
    }
}
