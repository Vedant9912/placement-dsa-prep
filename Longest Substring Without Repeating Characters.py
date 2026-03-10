def lengthOfLongestSubstring(self, s: str) -> int:
        mystring=""
        j=1
        longests=0
        for i in range(len(s)):
            if s[i] not in mystring:
                mystring+=s[i]
            else:
                j=mystring.index(s[i])
                mystring=mystring[j+1:]
                mystring+=s[i]
            if longests<len(mystring):
                longests=len(mystring)
        return longests
