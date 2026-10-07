class Solution {
public:
    bool isAscii(char c)
    {
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || 
            (c>='0' && c<='9') )
            return true;
        return false;
    }
    bool isPalindrome(string s) {
        int i=0;
        int j=s.size()-1;

        while(i<j)
        {
            //check i
            if(!isAscii(s[i]))
            {
                i++;
            }else if(!isAscii(s[j])){
                j--;
            }else if(tolower(s[i])!=tolower(s[j]))
            {
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
};
