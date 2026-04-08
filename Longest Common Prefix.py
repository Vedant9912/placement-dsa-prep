class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        ch=0
        while ch<len(strs[0]):
            for i in range(1,len(strs)):
                if ch>=len(strs[i]) or strs[0][ch] != strs[i][ch]:
                    return strs[0][:ch]
            ch+=1
        return strs[0]
