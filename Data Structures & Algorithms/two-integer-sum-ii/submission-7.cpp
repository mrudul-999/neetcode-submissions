class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans(2,1);
        int i = 0, j = nums.size()-1;
        //2,3,4 
        //6
        while(i<j)
        {
            int x = nums[i] + nums[j];
            if(x>target)
            {
                j--;
            }
            else if(x<target)
            {
                i++;
            }
            else {
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }

        }
    
    return ans;
    }
};
