class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        set<int> s;
        for(int i=0;i<nums.size();i++)
        {
            s.insert(nums[i]);
        }//[2,20,4,10,3,4,5]
        int largest=0,length=0;
        for(int i=0;i<nums.size();i++)
        {
            length=0;
            if(s.find(nums[i]-1)==s.end())
            { //if its start of a pattern
                while(s.find(nums[i]+length)!=s.end())
                {
                    length++;
                }
            largest = max(largest,length);
            }
        }
        return largest;
    }
};
