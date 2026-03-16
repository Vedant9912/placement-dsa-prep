class Solution:
    def reverseWords(self, s: str) -> str:
        s=s.strip()
        mylist =s.split()
        mylist=mylist[::-1]
        return " ".join(mylist)
        
