class Solution:
    def countSubstrings(self ,arr):
        res=""
        reslen=0
        count=0
        for i in range(len(arr)):
            l=i
            r=i
            while l>=0 and r<len(arr) and arr[l]==arr[r]:
                if r-l+1>reslen:
                    res=arr[l:r+1]
                    reslen=r-l+1
                count+=1
                l-=1
                r+=1
            l=i
            r=i+1     
            while l>=0 and r<len(arr) and arr[l]==arr[r]:
                if r-l+1>reslen:
                    res=arr[l:r+1]
                    reslen=r-l+1
                count+=1
                l-=1
                r+=1
        return count
        
