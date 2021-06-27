package LinkedList;

public class GenericNode<T> {
    public T data;
    public GenericNode next;

    public GenericNode(T data) {
//        System.out.println("GENERIC");
        this.data = data;
//        this.next = next;
    }

    public GenericNode(T value, GenericNode next) {
        this.data = data;
        this.next = next;
    }
}
