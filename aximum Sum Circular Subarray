class Solution(object):
    def maxSubarraySumCircular(self, nums):
        currentmax=nums[0]
        currentmin=nums[0]
        maxsum=nums[0]
        minsum=nums[0]
        total=nums[0]
        for i in range(1,len(nums)):
            currentmax=max(nums[i],currentmax+nums[i])
            maxsum=max(currentmax,maxsum)

            currentmin=min(nums[i],currentmin+nums[i])
            minsum=min(currentmin,minsum)
            
            total+=nums[i]

        if maxsum<0:
            return maxsum

        return max(maxsum,total-minsum)
