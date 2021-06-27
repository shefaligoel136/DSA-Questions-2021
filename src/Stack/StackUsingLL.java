package Stack;

import LinkedList.GenericNode;

public class StackUsingLL<T> {

    private GenericNode<T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T elem){
        GenericNode<T> temp = new GenericNode<T>(elem);
        temp.next = head;
        head = temp;
        size++;
    }

    public T top() throws StackEmptyException {
        if(head==null){
            throw new StackEmptyException();
        }
        return head.data;
    }

    public T pop() throws StackEmptyException {
        if(head==null){
            throw new StackEmptyException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
