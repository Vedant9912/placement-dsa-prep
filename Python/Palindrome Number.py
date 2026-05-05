# class Solution:
#     def isPalindrome(self, x: int) -> bool:
#         return str(x) == str(x)[::-1]



class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        original=x
        reverse=0
        while x!=0:
            digit =x%10
            reverse = reverse*10 +digit
            x=x//10
        return original == reverse

