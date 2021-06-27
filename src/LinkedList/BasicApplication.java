package LinkedList;

import java.util.Scanner;

public class BasicApplication {
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

    public void getValue(int index){
        Node temp = head;
        int pos =0;
        if(temp==null){
            System.out.println("No element in the list");
            return;
        }
        if(index<0 || index>getLength()){
            System.out.println("Invalid index");
            return;
        }
        while(temp!=null){

            if(pos==index){
                System.out.println("The value is: "+temp.value);
                return;
            }
            pos++;
            temp=temp.next;
        }
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

    public void addAtHead(int data){
        Node temp = head;
        if(temp==null){
            temp = new Node(data,null);
            head = temp;
            return;
        }
        Node new_temp = new Node(data,temp);
        head = new_temp;
    }

    public void addAtIndex(int index,int data){
        int len = this.getLength();

        if(index==0 || len==0){
            addAtHead(data);
            return;
        }

        if(index==len+1){
            this.push(data);
            return;
        }
        if(index>len||index<0){
            System.out.println("Invalid");
            return;
        }
        Node temp_1 = head;
        Node temp_2 = null;
        int pos=0;

        while(pos!=index){
            temp_2 = temp_1;
            temp_1 = temp_1.next;
            pos++;
        }
        temp_2.next = new Node(data,temp_1);
    }

    public void deleteAtIndex(int index){
        int len = this.getLength();
        Node temp_1 = head;
        if(temp_1==null){
            System.out.println("No element to delete");
            return;
        }
        if(index>len||index<0){
            System.out.println("Invalid");
            return;
        }
        if(index==0){
            head = temp_1.next;
            return;
        }
        int pos = 0;
        Node temp_2 = null;

        while(pos!=index){
            temp_2 = temp_1;
            temp_1 = temp_1.next;
            pos++;
        }
        temp_2.next = temp_1.next;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BasicApplication list1 = new BasicApplication();

        System.out.println("Enter number of elements for the Linklist");
        int n = sc.nextInt();

        System.out.println("Enter the elements");
        for(int i = 0;i<n;i++){
            int num = sc.nextInt();
            list1.push(num);
        }

        System.out.println("The list elements are");
        list1.show();

        System.out.println("Value of which location is to be known");
        int index = sc.nextInt();
        list1.getValue(index);

        System.out.println("Which element you'd want to place at head");
        int data = sc.nextInt();
        list1.addAtHead(data);
        list1.show();

        System.out.println("Enter position and data you want to add");
        int position = sc.nextInt();
        int value = sc.nextInt();
        list1.addAtIndex(position,value);
        System.out.println("New list is");
        list1.show();

        System.out.println("At which position do you want to remove the element");
        int delPos = sc.nextInt();
        list1.deleteAtIndex(delPos);
        list1.show();
    }
}
