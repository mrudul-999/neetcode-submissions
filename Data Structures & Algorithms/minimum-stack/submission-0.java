class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<Integer>();
        
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
        int mini = Integer.MAX_VALUE;
        for(int n : stack)
        {
            if(n < mini)
            {
                mini = Math.min(n,mini); 
            }
        }
        return mini;
        
    }
}
