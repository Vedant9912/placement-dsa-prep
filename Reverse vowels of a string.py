class Solution:
    def reverseVowels(self, arr):
        arr=list(arr)
        left=0
        right=len(arr)-1
        while left < right:
            while left<right and arr[left] not in ["a","e","i","o","u","A","E","I","O","U"]:
                left+=1

            while left<right and arr[right] not in ["a","e","i","o","u","A","E","I","O","U"]:
                right-=1

            arr[left],arr[right]=arr[right],arr[left]
            left+=1
            right-=1
        return  "".join(arr)
