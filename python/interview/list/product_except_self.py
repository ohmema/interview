"""
[1,2,3,4] => [24, 12, 8,6]
[2, 4,0, -6] => [0, 0, -48, 0]
[0, 4, 0, 6]=> [0,0,0,0]
"""
from functools import reduce

def product_except_self(nums):
    if nums.count(0) > 1:
        for i in range(len(nums)):
            nums[i] =0
        return nums

    if nums.count(0) == 1:
        product = 1
        for e in nums:
            product *= e if e != 0 else 1;

        for i in range(len(nums)):
            nums[i] = product if nums[i] == 0 else 0;
        return nums

    product = 1
    for e in nums:
        product *= e

    for i in range(len(nums)):
        nums[i] = product//nums[i]
    return nums

input = [1,2,3,4,5]
print(input, end=" : ")
print(product_except_self(input))


input = [1,2,0,4,5]
print(input, end=" : ")
print(product_except_self(input))


input = [0,2,0,4,5]
print(input, end=" : ")
print(product_except_self(input))