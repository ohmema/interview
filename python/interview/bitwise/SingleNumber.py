"""
  Single Number
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
"""
def singleNumber(nums):
    sss= 0

    for i in range(len(nums)):
        sss ^= nums[i]

    return sss

_l = [3, 1,2,5, 5, 1,2, 11, 3]

print(singleNumber(_l))