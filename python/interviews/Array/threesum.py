"""
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
"""


def threeSum_slow(nums):
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
    #print (memo)
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


def threeSum(nums):
    nums.sort()
    r = []
    for i in range(len(nums)-2):
        j = i+1
        k = len(nums) - 1

        while j < k:
            s = nums[i] + nums[j] + nums[k]
            if s == 0:
                r.append([nums[i], nums[j], nums[k]])
                j += 1
                k -= 1
                #Careful, I got wrong here
                while j < k and nums[j] == nums[j-1]:
                    j += 1
                while j > k and nums[k] == nums[k+1]:
                    k -= 1

            elif s > 0:
                k -= 1
            elif s < 0:
                j += 1
    return r

inputs = [[-1, 0, 1, 2, -1, -4]]
for i in inputs:
    print(i, end= " : ")
    print(" {} : {}".format(threeSum_slow(i), threeSum(i)))