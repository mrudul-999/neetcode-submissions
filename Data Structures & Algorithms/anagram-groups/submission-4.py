class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        dict1 = defaultdict(list) 



        for s in strs :
            lst = [0]*26
            for c in s :
                lst[ord(c)-ord('a')] +=1

            dict1[tuple(lst)].append(s)
        
        res = []

        for key,value in dict1.items() :
            res.append(value)
        
        return res
        