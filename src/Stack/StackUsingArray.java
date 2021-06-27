package Stack;

public class StackUsingArray {

    private static int data[];
    private static int topIndex;

    public StackUsingArray(){
        data = new int[10];
        topIndex = -1;
    }

    public StackUsingArray(int size){
        data = new int[size];
        topIndex = -1;
    }

    public static void push(int e) throws StackFullException {
        if(topIndex == data.length-1){
            // Throw Exception
//            StackFullException exp = new StackFullException();
//            throw exp;
            // throw new StackFullException();

            doubleCapacity();
        }
        data[topIndex+1] = e;
        topIndex = topIndex + 1;
    }

    private static void doubleCapacity() {
        int temp[] = data;
        data = new int[2* temp.length];
        for(int i=0;i< temp.length;i++){
            data[i] = temp[i];
        }
    }

    public static int top() throws StackEmptyException {
        if(topIndex == -1){
            // Throw StackEmptyException
            throw new StackEmptyException();
        }
        return data[topIndex];
    }

    public static int pop() throws StackEmptyException{
        if(topIndex == -1){
            // Throw StackEmptyException
            throw new StackEmptyException();
        }else{
            int temp = data[topIndex];
            topIndex = topIndex-1;
            return temp;
        }
    }

    public static int size(){
        return topIndex+1;
    }

    public static boolean isEmpty(){
        return topIndex == -1;
    }

}
