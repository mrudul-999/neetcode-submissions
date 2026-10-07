
class Solution {

public int binary_search(int[] num, int l,int r, int target)
{
     ///nums,0,3,1
    //mid = 0+(0+3)/2 = 3/2 = 1

    while(l<=r)
    {
        int mid = l + (r-l)/2;
        if(target > num[mid])// 1 > 4?
        {
            l = mid + 1;
        }
        else if(target < num[mid])
        {
            r = mid - 1; // r = 1 - 1 = 0
        }
        else {
            return mid;
        }
    }
    return -1;
}



    public int search(int[] nums, int target) {
        
      
        //3.5
      int first = nums[0];  //3
      int divide = 0; 
      int flag = 0;
      for(int i=1;i<nums.length;i++)
      {
         if(nums[i]<first) 
         {
            divide = i; //divide = 4
            flag = 1;
            break;
         }
      }

      if(flag == 1){
      //0 - divide and divide + 1 to lenght-1
      int first_array_first = nums[0];
      int second_array_first = nums[divide];

      //which array to chose?
      if(nums.length == 1 && nums[0] == target) {return 0;}
      else if(nums.length ==1)return -1;

      if (target >= nums[0] && target <= nums[divide - 1]) {
    return binary_search(nums, 0, divide - 1, target);
} else {
    return binary_search(nums, divide, nums.length - 1, target);
} 
      }else {
        return binary_search(nums,0,nums.length-1,target);
      }






            




    }
}
