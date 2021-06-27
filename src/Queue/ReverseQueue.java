package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=0;i<10;i++){
            queue.add(i);
        }
        queue = revQ(queue);
        for(int i=0;i<10;i++){
            System.out.println(queue.poll());
        }
    }
    public static Queue<Integer> revQ(Queue<Integer> queue){
        if(queue.isEmpty()){
            return queue;
        }
        int data = queue.poll();
        queue = revQ(queue);
        queue.add(data);
        return queue;
    }
}
