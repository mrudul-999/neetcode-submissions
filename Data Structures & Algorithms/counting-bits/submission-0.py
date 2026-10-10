class Solution:
    def countBits(self, n: int) -> List[int]:
        ans = []
        res = 0
        for i in range(n+1) :
            while i :
                res += i & 1
                i = i >> 1
            ans.append(res)
            res = 0

        return ans

            



        