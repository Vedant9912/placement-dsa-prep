class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = []
        product = 1
        for i in range(len(nums)):
            if i != 0:
                product *= nums[i - 1]
                result.append(product)
            else:
                result.append(1)
        product = 1
        for j in range(len(nums) - 1, -1, -1):
            if j != len(nums) - 1:
                product *= nums[j + 1]
                result[j] = result[j] * product
        return result
