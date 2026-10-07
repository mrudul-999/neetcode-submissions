class Solution {
    public boolean isValid(String s)
    {//[(
        Stack<Character> stack = new Stack<>();
        //[(])
        int i=0;
        while(i!=s.length())
        {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
            {
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
            {
                if(stack.isEmpty())return false;
                if(!stack.isEmpty()) {
                    if (stack.peek() == '{' && s.charAt(i) == '}' || stack.peek() == '(' && s.charAt(i) == ')' ||
                            stack.peek() == '[' && s.charAt(i) == ']') {
                        
                            stack.pop();
                    }
                    else break;
                }
            
            }
            i++;
        }

        return stack.isEmpty();
    }
}
