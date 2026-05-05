class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        if len(num1)>len(num2):
            L=num1
            S=num2

        else:
            L=num2
            S=num1
        diff=len(L)-len(S)
        result=[0]*len(L)
        carry=0
    
        for i in range(len(L)-1,-1,-1):
            if i-diff>-1:
                result[i]=int(L[i])+int(S[i-diff])+carry
                carry=0
            else:
                result[i]=int(L[i])+carry
                carry=0
            if result[i]>9 and i>0:
                result[i]=result[i]%10
                carry+=1
        return "".join(map(str,result))
