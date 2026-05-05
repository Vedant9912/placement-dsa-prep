class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        left=0
        i=1
        while i < len(nums):
            if nums[left]!=nums[i]:
                nums[left+1]=nums[i]
                left+=1
                i+=1
            else:
                i+=1
        return left+1
