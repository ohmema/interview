"""
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

Example 1:

Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum
             jump length is 0, which makes it impossible to reach the last index.
"""
def canJump_timeover(nums):
    memo = [-1] * len(nums)
    memo[0] = 0
    for i in range(len(nums) ):
        if memo[i] == -1:
            continue
        e = nums[i]
        for index in range(i + 1, i+ e + 1):
            if index < len(nums):
                memo[index] = i
    if memo[len(nums)-1] != -1:
        return True
    return False


def canJump(nums):
    memo = []
    i = 0
    for i in range(len(nums)):
        e = nums[i]
        _range = [i+1, i + e + 1]
        memo.append(_range)
    i =0
    while i < len(memo)-1 :
        if memo[i + 1][0] <= memo[i][1] <= memo[i + 1][1]:
            memo[i][1] = memo[i + 1][1]
            del memo[i + 1]
            continue
        elif memo[i][1] > memo[i + 1][1]:
            del memo[i + 1]
            continue

        i += 1
    if len(memo) == 1 or len(nums) == 1:
        return True
    else:
        return False


inputs = [[0], [3,2,1,0,4],[2,3,1,1,4],  [ 0 , 3 , 1 , 1 , 4 ] ]

for i in inputs:
    print(canJump(i))