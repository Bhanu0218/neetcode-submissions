class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        
        for(String s : tokens) {
            if(!s.equals("+") && !s.equals("-") && !s.equals("/") && !s.equals("*")) {
                stack.push(Integer.parseInt(s));
            } else if(s.equals("+")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 + num1);
            }else if(s.equals("-")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 - num1);
            } else if(s.equals("/")) {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 / num1);
            } else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                stack.push(num2 * num1);
            }
        }
        return stack.peek();
    }
}
