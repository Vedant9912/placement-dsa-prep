class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        mydict=dict()
        for i in arr:
            if i in mydict:
                mydict[i]+=1
            else:
                mydict[i]=1
        newarr=mydict.values()
        myset=set()
        for i in newarr:
            if i in myset:
                return False
            else:
                myset.add(i)
        return True
