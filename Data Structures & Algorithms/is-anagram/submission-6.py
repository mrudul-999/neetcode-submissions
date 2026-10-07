class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) :
            return False
        
        #nlogn
        # if sorted(s) == sorted(t) :
        #     return True
        # return False

        dict_s = {}

        for c in s :
            dict_s[c] = dict_s.get(c,0) + 1
        
        for c in t :
            if c in dict_s :
                dict_s[c] = dict_s[c] - 1
        
        for c in t :
            if dict_s.get(c) != 0 :
                return False

        return True

        
        