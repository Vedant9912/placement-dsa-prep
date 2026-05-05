class Solution(object):
    def maxSubArray(self, nums):
        current=max_sofar=nums[0]
        for i in  range(1,len(nums)):
            current=max(nums[i],current+nums[i])
            if max_sofar<current:
                max_sofar=current

        return max_sofar
