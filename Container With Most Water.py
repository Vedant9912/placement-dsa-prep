class Solution:
    def maxArea(self, height: List[int]) -> int:
        left=0
        right=len(height)-1
        maxproduct=0
        while left<right:
                product=min(height[left], height[right]) * (right - left)
                if product> maxproduct:
                    maxproduct=product
                if height[left]<height[right]:
                    left+=1
                else:
                    right-=1
            
        return maxproduct
