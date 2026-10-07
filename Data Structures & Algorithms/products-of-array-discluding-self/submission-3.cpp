class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        //division 
        //[1,0,3,0,5]
        int zc=0,prod=1;
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
            zc++;//zero count
            else
            prod*=nums[i]; //prod non zeros 

        }
        vector<int> res(nums.size(),0);
        if(zc>1)
        {
            return res;
        }
        else{
            //when no zero
            if(zc==0)
            {
                for(int i=0;i<nums.size();i++)
                {
                    res[i] = prod/nums[i];
                }
            }
            else{//zc==1
            for(int i=0;i<nums.size();i++)
            {
                if(nums[i]==0)
                res[i] = prod;
            }



            }

        }

    return res;
    }
};
