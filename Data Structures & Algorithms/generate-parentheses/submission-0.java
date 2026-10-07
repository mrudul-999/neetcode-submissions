class Solution {
    public List<String> generateParenthesis(int n) {
        
        int open = 0;
        int close = 0;
        List<String> res = new ArrayList<>();
        String str = "";
        backtrack(res,str,open,close,n);
        return res;
        
    }

    void backtrack(List<String> res, String str, int open,
    int close,int n)
    {
        if(close == open && close == n && open == n)
        {
            res.add(str);
        }
        
        if(open<n)
        {
            backtrack(res,str+ "(",open+1,close,n);
        }

        if(close<open)
        {
            backtrack(res,str + ")",open,close+1,n);
        }
    }
}
