package Queue;

import LinkedList.GenericNode;

public class QueueUsingLL<T> {
    private GenericNode<T> front;
    private GenericNode<T> rear;
    private int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void enqueue(T ele){
        GenericNode<T> newNode = new GenericNode<>(ele);
        if(front == null){
            front = newNode;
            rear = newNode;
        }else{
            rear.next = newNode;
            rear = rear.next;
//          rear = newNode;
        }
        size++;
        rear.next = null;
    }

    public T dequeue() throws QueueEmptyException {
        if(front == null){
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        size = size-1;
        if(front == null){
            rear = null;
        }
        return temp;
    }

    public T front() throws QueueEmptyException {
        if(front == null){
            throw new QueueEmptyException();
        }
        return front.data;
    }
}
