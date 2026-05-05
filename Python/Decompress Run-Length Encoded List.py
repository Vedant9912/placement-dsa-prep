class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        mylist=[]
        for i in range(0,len(nums),2):
            dlist=[nums[i+1]]*nums[i]
            mylist.extend(dlist)
        return mylist
