class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        //94
        //a=4,b=9
        for(String s : tokens)
        {
            if(s.equals("+") || s.equals("-") || s.equals("*")
            || s.equals("/"))
            {
                int a = Integer.parseInt(stack.pop());
                int b = Integer.parseInt(stack.pop());
                if(s.equals("+"))
                {
                    stack.push(Integer.toString(b+a));
                }else if(s.equals("-"))
                {
                    stack.push(Integer.toString(b-a));
                }else if(s.equals("*"))
                {
                    stack.push(Integer.toString(a*b));
                }else if(s.equals("/"))
                {
                    stack.push(Integer.toString(b/a));
                }
            }else{
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.peek());
    }
}
