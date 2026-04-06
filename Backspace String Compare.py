class Solution:
    def backspaceCompare(self, s: str, t: str) -> bool:
        count=0
        s=list(s)
        t=list(t)
        for i in range(len(s)-1,-1,-1):
            if s[i]=="#":
                count+=1
                s[i]=''
            else:
                if count!=0:
                    s[i]=''
                    count-=1
                else:
                    pass
        count=0
        for j in range(len(t)-1,-1,-1):
            if t[j]=="#":
                count+=1
                t[j]=''
            else:
                if count!=0:
                    t[j]=''
                    count-=1
                else:
                    pass

        return "".join(s)=="".join(t)
