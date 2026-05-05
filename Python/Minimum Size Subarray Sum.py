class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        slow=0
        fast=0
        summ=0
        minimumsize=float("inf")
        result=None
        while fast<len(nums):
            summ+=nums[fast]
            fast+=1
            if summ>=target:
                while summ>=target:
                    if minimumsize>fast-slow:
                        result=fast-slow
                        minimumsize=result
                    summ-=nums[slow]
                    slow+=1
        return result or 0
