class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s=s.strip()
        lst=s.split(" ")
        return len(lst[-1])
