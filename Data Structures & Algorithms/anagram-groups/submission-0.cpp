class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        //approach 1
        map<string,vector<string>> mp;
        for(auto it = strs.begin();it!=strs.end();it++)
        {
            string s = *it;
            sort(s.begin(),s.end());
            mp[s].push_back(*it);
        }

        vector<vector<string>> result;

        for(auto it = mp.begin();it!=mp.end();it++)
        {
            result.push_back(it->second);
        }

        return result;
        

        

    }
};
