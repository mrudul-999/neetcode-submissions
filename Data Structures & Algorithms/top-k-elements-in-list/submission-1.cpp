class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        map<int,int> m;

        for(int i=0;i<nums.size();i++)
        {
            m[nums[i]]++;
        }
        vector<pair<int,int>> vp;

        for(auto it : m)
        {
            vp.push_back(it);
        }

        sort(vp.begin(),vp.end(),[](pair<int,int> a,pair<int,int> b)
        {
            return a.second > b.second ;
        });

        vector<int> ans;

        for(auto it = vp.begin();it!=vp.end();it++)
        {
            ans.push_back(it->first);
            k--;
            if(k==0)break;
        }
        
        
        return ans;
    }
};
