import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static Queue<Integer> reverseQueue(Queue<Integer> queue){
        Stack<Integer> temp = new Stack<>();
        while(!queue.isEmpty()){
            temp.push(queue.poll());
        }
        while(!temp.isEmpty()){
            queue.add(temp.pop());
        }
        return queue;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1;i<=10;i++){
            queue.add(i);
        }
        Queue<Integer> ans= reverseQueue(queue);
        while (!ans.isEmpty()){
            System.out.print(queue.remove()+" ");
        }
    }
}
