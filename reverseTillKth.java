import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseTillKth {
    public static Queue<Integer> reverseTillKth(Queue<Integer> q, int k){
        Queue<Integer> ans = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        while(k >0 ){
            stack.push(q.remove());
            k--;
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        while(!q.isEmpty()){
            ans.add(q.remove());
        }
        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        for(int i=1;i<=10;i++){
            queue.add(i);
        }
        Queue<Integer> ans= reverseTillKth(queue,5);
        System.out.println(ans);
    }
}
