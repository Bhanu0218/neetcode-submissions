class MinStack {

    private Deque<Integer> stack;

    public MinStack() {
        stack = new ArrayDeque();
    }
    
    public void push(int val) {
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        Deque<Integer> newStack = new ArrayDeque<>();
        int mini = stack.peek();

        while(!stack.isEmpty()) {
            mini = Math.min(mini, stack.peek());
            newStack.push(stack.pop());
        }

        while(!newStack.isEmpty()) {
            stack.push(newStack.pop());
        }
        return mini;
    }
}
