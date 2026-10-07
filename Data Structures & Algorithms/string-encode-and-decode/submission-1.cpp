class Solution {
public:

    string encode(vector<string>& strs) {
            string ans = "";

            for(auto it : strs)
            {
                ans+= to_string(it.size()) + "#";
                ans+=it;
            }//5#neet4#code4#love3#you
            //2#we3#say1#:3#yes
            return ans;
    }

    vector<string> decode(string s) {
        int i = 0, j = 0;
        //2#we3#say1#:3#yes
        vector<string> vs;
        while(s[i]!='\0')
        {
            string num = "";
             while(s[i]!='#')
             {
                num = num + s[i];
                i++;
             }//4#neet4#code4#love3#you
             //num=4
             int cnum = stoi(num);//cnum=4
             i++;
             string put = "";
             while(cnum--)
             {
                put+=s[i];
                i++;
             }

             vs.push_back(put);

             
        }
        return vs;
    }
};
