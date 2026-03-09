class Solution:
    def threeSum(self,arr):
        arr.sort()
        result=[]
        for i in range(len(arr)-2):
            if i>0 and arr[i]==arr[i-1]:
                continue
            left=i+1
            right=len(arr)-1
            while left<right:
                summ=arr[left]+arr[right]+arr[i]
                if summ>0:
                    right-=1
                elif summ==0:
                    result.append([arr[left],arr[right],arr[i]])
                    while left<right and arr[left]==arr[left+1]:
                        left+=1
                    while left<right and arr[right]==arr[right-1]:
                        right-=1
                    left+=1
                    right-=1

                else:
                    left+=1
        return result
