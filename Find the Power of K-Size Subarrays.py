class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        result = []
        a = 0
        for i in range(k-1, len(nums)):
            subarray = nums[a:i+1]
            for j in range(len(subarray)-1):
                if subarray[j] < subarray[j+1]:
                    if subarray[j]+1!=subarray[j+1]:
                        result.append(-1)
                        break
                else:
                    result.append(-1)
                    break
            else:
                result.append(subarray[-1])
            a += 1
        return result
