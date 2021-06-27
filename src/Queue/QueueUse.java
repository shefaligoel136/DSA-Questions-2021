package Queue;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException {
        QueueUsingArray queue1 = new QueueUsingArray();
        QueueUsingArray queue2 = new QueueUsingArray(10);
        int arr[] = {10,20,30,40,50};
        for(int ele: arr){
            queue1.enqueue(ele);
        }
        while(!queue1.isEmpty()){
            try{
                System.out.println(queue1.dequeue());
            }catch (QueueEmptyException e){
                System.out.println("Queue is Empty");
            }
        }
        System.out.println(queue1.size());


        System.out.println("Using LL");

        QueueUsingLL<Integer> queue3 = new QueueUsingLL<Integer>();
        for(int ele: arr){
            queue3.enqueue(ele);
        }
        while(!queue3.isEmpty()){
            try{
                System.out.println(queue3.dequeue());
            }catch (QueueEmptyException e){
                System.out.println("Queue is Empty");
            }
        }
//        System.out.println(queue3.dequeue());
    }
}
