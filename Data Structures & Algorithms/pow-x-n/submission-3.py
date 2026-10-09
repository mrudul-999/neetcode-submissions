class Solution:
    def myPow(self, x: float, n: int) -> float:
        # if x == 0 :
        #     return 0
        # if n == 0 :
        #     return 1

        # result = 1
        # for i in range(abs(n)) :
        #     result *= x
            
        # if n < 0 :
        #     result = 1/result
        # return result


        # x^n = (x^2)^n/2
        # x^n = (x^2)^n-1/2

        def recursive(x,n) :
            if x == 0 :
                return 0
            if n == 0 :
                return 1 
            
            temp = recursive(x, n//2)

            if n % 2 == 0 :
                return temp * temp
            else :
                return x* temp * temp

        ans= recursive(x,abs(n))
        if n > 0 :
            return ans 
        else :
            return 1/ans
