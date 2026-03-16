class Solution:
    def repeatedStringMatch(self, a: str, b: str) -> int:
        for i in b:
            if i not in a:
                return -1
        count=0
        strr=a
        for i in range(len(b)//len(a)+3):
            count+=1
            if b in strr:
                return count
            else:
                strr+=a

        return -1
