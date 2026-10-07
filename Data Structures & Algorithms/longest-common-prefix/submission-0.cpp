class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        //bakwas approach
        string base = strs[0];
        string ans = "";
        int i=0,j=0,flag;
        while(base[i]!='\0')
        {
            flag = 1;
            char c = base[i];
            for(auto it=strs.begin()+1;it!=strs.end();it++)
            {   
                string temp = *it;
                if(temp[j]!=c)
                {
                    flag=0;
                }
            }
            if(flag==1)
            {
                ans = ans + c;
                i++;
                j++;
            }
            else break;
        }
        return ans;
        
    }
};