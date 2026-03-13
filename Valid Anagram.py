class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        newdict=dict()
        newdict=[0]*26
        for i in range(len(s)):
            skey=ord(s[i])-ord("a")
            tkey=ord(t[i])-ord("a")
            newdict[skey]+=1
            newdict[tkey]-=1
        for i in range(26):
            if newdict[i]!=0:
                return False
        return True
