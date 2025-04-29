import java.util.Stack;
public class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue(Stack<Integer> stack1, Stack<Integer> stack2){
        this.stack1 = stack1;
        this.stack2 = stack2;
    }

    public int size(){
        return stack1.size() + stack2.size();
    }

    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public void addElement(int num){
        stack1.push(num);
    }

    public int removeElement() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
