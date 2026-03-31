from typing import List

def product_except_self(nums: List[int]) -> List[int]:

    n = len(nums)
    result = [1] * n

    # Step 1: Compute prefix products
    prefix_product = 1
    for i in range(n):
        result[i] = prefix_product
        prefix_product *= nums[i]

    # Step 2: Compute suffix products and multiply into result
    suffix_product = 1
    for i in range(n-1, -1, -1):
        result[i] *= suffix_product
        suffix_product *= nums[i]

    return result
