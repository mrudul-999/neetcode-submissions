class Solution {
public:
    void sortColors(vector<int>& nums) {
        int z=0,o=0,t=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)z++;
            else if(nums[i]==1)o++;
            else t++;
        }
        int k=0;

        while(z--)
        nums[k++]=0;

        while(o--)
        nums[k++]=1;

        while(t--)
        nums[k++]=2;
    }
};