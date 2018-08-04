
#memory bound implimataion
def remove_deuplicate(nums):
    single, i = 0, 1
    while i < len(nums):
        if not isDuplicate(nums, single, nums[i]):
            single += 1
            nums[single], nums[i] = nums[i], nums[single]
        i += 1
    return nums, single


def isDuplicate(nums, k, target):
    i = 0;
    while ( i <= k):
        if nums[i] == target:
            return True
        i += 1
    return False


input = [-1, 2, 4, 2, 4]
print(input, end= " : ")
print(remove_deuplicate(input))


input = [2, 2, 4, 2, 4]
print(input, end= " : ")
print(remove_deuplicate(input))


input = [0,0,0,0,0,0]
print(input, end= " : ")
print(remove_deuplicate(input))

input = [i for i in range(21)]
print(input, end= " : ")
print(remove_deuplicate(input))