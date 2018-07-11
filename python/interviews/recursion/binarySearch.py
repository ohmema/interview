"""
Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

You are given a target value to search. If found in the array return its index, otherwise return -1. You may assume no duplicate exists in the array.

"""


def binarySearch(nums, target):
    return _binarySearch(nums, target, 0, len(nums)-1)

def _binarySearch(nums, target, start, end):
    if start > end:
        return -1
    mid = (start + end)//2
    if nums[mid] == target:
        return mid

    if nums[start] < nums[mid]:
        if nums[start] <= target < nums[mid]:
            return _binarySearch(nums, target, start, mid -1)
        else:
            return _binarySearch(nums, target, mid + 1, end)
    else:
        if nums[mid] < target <= nums[end]:
            return _binarySearch(nums, target, mid + 1, end)
        else:
            return _binarySearch(nums, target, start, mid -1)


l= [i for i in range(10)]

for i in range(10):
    t = l+l
    t = t[i:len(l)+i]
    index = binarySearch(t, 5)
    print("{} : {} : {}".format(t, 5, index))