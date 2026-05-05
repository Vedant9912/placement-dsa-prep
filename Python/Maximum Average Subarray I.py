class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:    
        maxsum=0
        window=0
        for i in range(k):
            window+=nums[i]
        maxsum=window
        for j in range(k,len(nums)):
            window=window+nums[j]-nums[j-k]
            maxsum=max(maxsum,window)
        return maxsum/k
  
