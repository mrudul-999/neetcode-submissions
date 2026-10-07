class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        #1
        # nums = sorted(nums)
        # n = len(nums)
        # for i in range(n-1):
        #     if nums[i] == nums[i+1]:
        #         return True;
        
        # return False;
        #2
        for i in range(len(nums)-1):
            for j in range(i+1, len(nums)):
                if nums[i] == nums[j]:
                    return True
        return False