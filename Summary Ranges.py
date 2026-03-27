class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        result=[]
        i=0
        j=0
        while j < len(nums):
            if nums[j]+1 in nums:
                j+=1
            else:
                if i==j:
                    result.append(str(nums[i]))
                else:
                    result.append(str(nums[i]) +"->"+str(nums[j]))
                j+=1
                i=j
        return result
        
