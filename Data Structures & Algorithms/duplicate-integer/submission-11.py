class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # n2

        # for i in range(len(nums)) :
        #     for j in range(len(nums)) :
        #         if i!=j and nums[i] == nums[j] :
        #             return True
        
        # return False

        #logn

        # nums = sorted(nums)
        
        # for i in range(len(nums)-1) :
        #     if nums[i] == nums[i+1] :
        #         return True

        # return False

        #n
        set1 = []

        for i in nums :
            if i in set1 :
                return True
            set1.append(i)
        return False


