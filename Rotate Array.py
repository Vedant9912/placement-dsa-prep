#O(n) solution
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.

        """
    
        n=len(nums)
        k=k%n
        def reverse(start,end):
            while start<end:
                nums[start],nums[end]=nums[end],nums[start]
                start+=1
                end-=1
                

        reverse(0,n-1)
        reverse(0,k-1)
        reverse(k,n-1)
    
              
#O(n2) solution
class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.

        """
        k=k%len(nums)
        for i in range(k):
            j=len(nums)-1
            k=nums[-1]
            while j >0:
                nums[j-1],nums[j]=nums[j],nums[j-1]
                j-=1
        return nums

                
