package LinkedList;

import java.util.Scanner;

public class SwapNodes {
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

    public void swapNodes(int n1,int n2){
        Node currX = head, currY=head, prevX=null, prevY=null;
        while(currX!=null && currX.value!=n1){
            prevX = currX;
            currX = currX.next;
        }
        while(currY!=null && currY.value!=n2){
            prevY = currY;
            currY = currY.next;
        }
        if(currX==null||currY==null)
            return;

        if(prevX!=null){
            prevX.next = currY;
        }
        else{
            head = currY;
        }

        if(prevY!=null){
            prevY.next = currX;
        }
        else{
            head = currX;
        }
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SwapNodes sn = new SwapNodes();
        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            sn.push(num);
        }
        System.out.println("Enter the keys you want to swap");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sn.swapNodes(n1,n2);
        sn.show();
    }
}
