class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        vector<int> res;

        for(int i=0;i<nums.size();i++)
        {
            int mult=1;
            for(int j=0;j<nums.size();j++)
            {
                if(i!=j)
                {
                    mult = mult * nums[j];
                }
            }
            res.push_back(mult);
        }
        return res;


    }
};
