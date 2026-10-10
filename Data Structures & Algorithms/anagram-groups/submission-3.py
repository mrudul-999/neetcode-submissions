class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        dict1 = defaultdict(list) 

        for s in strs :
            dict1[''.join(sorted(s))].append(s)
        
        res = []

        for key,value in dict1.items() :
            res.append(value)
        
        return res
        