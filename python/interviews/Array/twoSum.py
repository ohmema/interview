def twoSum(nums, target):
    """
    :type nums: List[int]
    :type target: int
    :rtype: List[int]
    """
    asked = dict()

    for i in range(len(nums)):
        need = target - nums[i]
        if need in asked:
            return [asked[need], i]
        asked[nums[i]] = i
    return []

def twoSum_2(nums, target):
    nums.sort()
    i = 0
    j = len(nums) -1

    while i < j :
        s = nums[i] + nums[j]
        if s < target:
            i += 1

        elif s > target:
            j -= 1

        else:
            return [i, j]

    return []

inputs = [([-2,-4, -9, -22 , 2, 7, 11, 15, 33, 21, 9 , 0, 0 ], 9)]

for i in inputs:
    print(twoSum(i[0], i[1]))
    print(twoSum_2(i[0],i[1]))

