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


def twoSum_nlogn(nums, target):
    # O(NlogN)
    nums.sort()
    i = 0
    #O(NlongN)
    for  i in range(len(nums)):
        index = binarySearch(nums, i + 1, len(nums)-1, target - nums[i])
        if index >= 0:
            return (i, index)

    return None

def binarySearch(nums, start, end, target):
    if start > end:
        return -1

    mid = (start+end)//2
    if nums[mid] > target:
        return binarySearch(nums, start, mid-1, target)

    elif nums[mid] < target:
        return binarySearch(nums, mid + 1, end, target)

    else:
        return mid


input= [-2, 4, 5,7,9,10]
target = 5
print("nums: {} target ( {} ) indexes: {}".format(input, target, twoSum_nlogn(input, target)))


input= [-2, 4, 5,7,9,10]
target = -2
print("nums: {} target ( {} ) indexes: {}".format(input, target, twoSum_nlogn(input, target)))


input= [-2, 4, 5,8 ,5,10]
target = 10
print("nums: {} target ( {} ) indexes: {}".format(input, target, twoSum_nlogn(input, target)))


def twoSum_n(nums, target):
    d = dict()

    for i, e in enumerate(nums):
        indexes = d.get(e,[])
        indexes.append((i))
        d[e] = indexes

    for i, e in enumerate(nums):
        counter = target - e;
        indexes = d.get(counter, [])
        if not indexes:
            continue
        if e == counter and len(indexes) > 1:
            return indexes[0], indexes[1]
        else:
            return i, indexes[0]

input= [-2, 4, 5,7,9,10]
target = 5
print("nums: {} target ( {} ) indexes: {}".format(input, target, twoSum_n(input, target)))


input= [-2, 4, 5,7,9,10]
target = -2
print("nums: {} target ( {} ) indexes: {}".format(input, target, twoSum_n(input, target)))


input= [-2, 4, 5,8 ,5,10]
target = 10
print("nums: {} target ( {} ) indexes: {}".format(input, target, twoSum_n(input, target)))


