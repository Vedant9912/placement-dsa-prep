class Solution:
      def sortArrayByParity(self, arr):
        left=0
        right=len(arr)-1
        while left < right:
            while left<right and arr[left]%2==0:
                left+=1
            while left<right and arr[right]%2!=0:
                right-=1
            arr[left],arr[right]=arr[right],arr[left]
        return arr
        
