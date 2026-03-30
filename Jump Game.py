class Solution:
    def canJump(self, nums: List[int]) -> bool:
        ranged=0
        for i in range(len(nums)):
            if i <= ranged:
                ranged=max(ranged,i+nums[i])
            else:
                return False
        return True
