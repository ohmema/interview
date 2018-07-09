"""
A unsorted array of integers is given; you need to find the max product formed by multiplying three numbers.
"""


def max_product_of_two(nums):
    nums.sort()
    return max(nums[0]*nums[1], nums[-1]*nums[-2])
nums=[[1,0,-2,-3,-4,-5,-6, -7], [-4, -3, -2, -1], [-1, 0, 2], [-1, 0, 3, 6]]

def max_product_of_three(nums):
    _max = max(nums[0]*nums[1], nums[-1]*nums[-2])

for i in nums:
    print("max product of two : {} : {}".format(i, max_product_of_two(i)))