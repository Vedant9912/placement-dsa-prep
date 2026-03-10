class Solution(object):
    def maxAbsoluteSum(self, nums):
        currentmax=0
        currentmin=0
        maxsum=0
        minsum=0
        for i in range(len(nums)):
            currentmax=max(nums[i],currentmax+nums[i])
            maxsum=max(currentmax,maxsum)

            currentmin=min(nums[i],currentmin+nums[i])
            minsum=min(currentmin,minsum)

        return(max(maxsum,abs(minsum)))
