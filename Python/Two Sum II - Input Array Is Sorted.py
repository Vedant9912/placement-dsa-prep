class Solution:
    def twoSum(self, arr: List[int], target: int) -> List[int]:
        left=0
        right=len(arr)-1
        while left<right:
            summ=arr[left]+arr[right]
            if summ>target:
                right-=1
            elif summ==target:
                return [left+1,right+1]
            else:
                left+=1

        return ""
