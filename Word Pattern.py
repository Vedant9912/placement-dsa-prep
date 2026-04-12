class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        freq={}
        s=s.split(" ")
        if len(pattern)!=len(s):
            return False
        if len(set(pattern))!=len(set(s)):
            return False
        for i in range(len(pattern)):
            if pattern[i] in freq:
                if freq[pattern[i]]==s[i]:
                    pass
                else:
                    return False
            else:
                freq[pattern[i]]=s[i]
        return True
        
