class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        n=len(needle)
        window=0
        # window=haystack[:n]
        for i in range(0,len(haystack)-n+1):
            window= haystack[i:i+n]
            if window==needle:
                return i

        return -1
