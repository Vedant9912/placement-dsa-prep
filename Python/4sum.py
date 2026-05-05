class Solution:
    def fourSum(self, arr: List[int], target: int) -> List[List[int]]:
        arr.sort()
        result=[]
        for j in range(len(arr)-3):
            if j > 0 and arr[j] == arr[j-1]:
                continue
            for i in range(j+1,len(arr)-2):
                if i > j+1 and arr[i] == arr[i-1]:
                    continue
                left=i+1
                right=len(arr)-1
                while left<right:
                    summ=arr[left]+arr[right]+arr[i]+arr[j]
                    if summ>target:
                        right-=1
                    elif summ==target:
                        result.append([arr[j], arr[i], arr[left], arr[right]])
                        while left<right and arr[left]==arr[left+1]:
                            left+=1
                        while left<right and arr[right]==arr[right-1]:
                            right-=1

                        left+=1
                        right-=1
                    else:
                        left+=1
        return result
