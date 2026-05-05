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
        for j in range(26):
            if newdict[j]!=0:
                return False
        return True


#method 2
class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s)!=len(t):
            return False
        newdict ={}
        for i in s:
            newdict[i]=newdict.get(i,0)+1
        
        for j in t:
            if j not in newdict:
                return False
            newdict[j]-=1

            if newdict[j]<0:
                return false

        return True
