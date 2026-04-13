from typing import List

class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        
        def subset(i, path):
            if i < 0:
                result.append(path.copy())
                return
            
            # include nums[i]
            path.append(nums[i])
            subset(i - 1, path)
            
            # exclude nums[i]
            path.pop()
            subset(i - 1, path)
        
        result = []
        subset(len(nums) - 1, [])
        return result
