class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        dictt1 = defaultdict(list)

        for str1 in strs :

            temp = "".join(sorted(str1))

            dictt1[temp].append(str1)

        return list(dictt1.values())


        