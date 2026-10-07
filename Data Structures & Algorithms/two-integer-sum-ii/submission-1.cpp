class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        //return 1 indexed
        vector<int> res(2,0);

        for(int i=0;i<nums.size();i++)
        {
            for(int j=i+1;j<nums.size();j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    res[0] = i+1;
                    res[1] = j+1;
                }
            }
        }
        return res;
        
    }
};
