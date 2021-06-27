package LinkedList;

import java.util.Scanner;

public class AddTwoNumber {
    Node head = null;

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

    public int getLength(){
        Node temp = head;
        int count = 0;
        if(temp==null){
            return count;
        }
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void add(Node list1, Node list2, AddTwoNumber list3){
        int n , carry=0;
        while(list1!=null){
            n = list1.value+ list2.value;
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddTwoNumber list1 = new AddTwoNumber();
        AddTwoNumber list2 = new AddTwoNumber();
        AddTwoNumber list3 = new AddTwoNumber();

        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list1.push(num);
        }

        System.out.println("Enter number of elements for the Linklist");
        n = sc.nextInt();

        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            list2.push(num);
        }
        add(list1.head,list2.head,list3);
        list1.show();
    }
}
