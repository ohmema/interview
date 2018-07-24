"""
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
"""


def threeSum(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    #nums.sort()
    memo = {}
    for i in range(len(nums)):
        for j in range(i + 1, len(nums)):
            indexes = memo.get(nums[i] + nums[j], set())
            indexes.add((i, j))
            memo[nums[i] + nums[j]] = indexes
    print (memo)
    re = []
    for i in range(len(nums)):
        k = -1 * nums[i]
        if k in memo:
            indexes = memo[k]
            for index in indexes:
                if i not in index:
                    l = [nums[index[0]], nums[index[1]], nums[i]]
                    l.sort()
                    if l not in re:
                        re.append(l)
    return re

inputs = [[-1, 0, 1, 2, -1, -4]]
for i in inputs:
    print(i, end= " : ")
    print(threeSum(i))