class Solution(object):
    def isPowerOfFour(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n<=0:
            return False
        if (n & n-1)==0:
            if (n & 0x55555555) !=0 :
                return True
            return False
        return False
