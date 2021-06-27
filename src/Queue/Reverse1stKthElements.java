package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse1stKthElements {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }
        queue = revQK(queue,5);
        for (int i = 0; i < 10; i++) {
            System.out.println(queue.poll());
        }
    }

    public static Queue<Integer> revQK(Queue<Integer> queue , int k){
        if(queue.isEmpty() || k>queue.size() || k<0){
            return queue;
        }

        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(queue.remove());
        }

        while(!stack.isEmpty()){
            queue.add(stack.pop());
        }
        for(int i=0;i<queue.size()-k;i++){
            queue.add(queue.remove());
        }
        return queue;
    }
}
