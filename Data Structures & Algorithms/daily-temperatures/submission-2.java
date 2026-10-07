class Solution {
    public int[] dailyTemperatures(int[] t) {

        int n  = t.length;
        int[] res = new int[n];
        int count = 0;
        int k = 0;
        for(int i=0;i<n-1;i++)
        {
            int flag = 0;
            for(int j=i+1;j<n;j++)
            {
                if(t[j]>t[i])
                {
                    count++;
                    res[k++] = count;
                    count=0;
                    flag=1;
                    break;
                }else{
                    flag=0;
                    count++;
                }
            }
            if(flag==0)
            {   count=0;
                res[k++] = count;
            }
        }
        return res;
    
    }
}
