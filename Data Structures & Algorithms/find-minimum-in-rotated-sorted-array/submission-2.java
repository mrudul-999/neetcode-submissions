class Solution {
    public int findMin(int[] nums) {//[1]
        int i = 0;
        int j = i+1;
        while(j<=nums.length-1)
        {
            if(nums[i]-nums[j]>0)
            return nums[j];

            i++;
            j++;

            
        }

        return nums[0];
    }
}
