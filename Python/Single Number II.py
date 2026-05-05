class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result=0
        for i in range(32):
            bit_sum=0
            for j in nums:
                if (j>>i) & 1 ==1:
                    bit_sum+=1
            if bit_sum%3==1:
                if i ==31:
                    result-=(1<<i)
                else:
                    result|=(1<<i)
        return result
