package Stack;

public class StackUse {
    public static void main(String[] args) throws StackFullException, StackEmptyException {
        StackUsingArray stack = new StackUsingArray(100);
        stack.push(10);
        System.out.println(stack.top());
        stack.size();
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());

        System.out.println("Now new Stack");

        StackUsingArray newStack = new StackUsingArray();
        int arr[] = {1,2,3,4,5,6,7,9,10,17,18};
        for (int i:arr) {
            newStack.push(i);
        }
        System.out.println(newStack.size());
        while(!newStack.isEmpty()){
            System.out.println(newStack.pop());
        }

        System.out.println("linked list");

        StackUsingLL<Integer> stackLL = new StackUsingLL<>();
        int ll[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        for (int i:ll) {
            stackLL.push(i);
        }
        System.out.println("Size of linked list" + " " + stackLL.size());
        while(!stackLL.isEmpty()){
            System.out.println(stackLL.pop());
        }

    }
}
