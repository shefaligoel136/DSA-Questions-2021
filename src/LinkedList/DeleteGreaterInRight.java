package LinkedList;

import java.util.Scanner;

public class DeleteGreaterInRight {

    Node head = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DeleteGreaterInRight list1 = new DeleteGreaterInRight();

        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list1.push(num);
        }
        list1.deleteGreater();
        list1.show();
    }

    public void push(int data) {
        Node temp = head;
        if (temp == null) {
            temp = new Node(data, null);
            head = temp;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data, null);
        }
    }

    public void show() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void deleteGreater() {
        Node curr = head;
        while (curr!=null && curr.next != null) {
            if (curr.value < curr.next.value) {
                curr.value = curr.next.value;
                curr.next = curr.next.next;
            } else {
                curr = curr.next;

            }
        }
    }
}
