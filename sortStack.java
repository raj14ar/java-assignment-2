import java.util.Stack;

public class sortStack {
    public static Stack<Integer> sortStack(Stack<Integer> stack){
        Stack<Integer> tempStack = new Stack<>();
        while(!stack.isEmpty()){
            int cur = stack.pop();
            if (!tempStack.isEmpty() && tempStack.peek() >= cur) {
                while (!tempStack.isEmpty() && tempStack.peek() > cur) {
                    stack.push(tempStack.pop());
                }
            }
            tempStack.push(cur);
        }
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }
        return stack;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(7);
        stack.push(15);
        stack.push(21);
        stack.push(2);
        stack.push(63);
        stack.push(48);
        Stack<Integer> ans=sortStack(stack);
        while (!ans.isEmpty()){
            System.out.print(ans.pop()+" ");
        }
    }
}
