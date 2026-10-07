class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        //move to end
        int k = 0 ;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]!=val)
            {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
};