# No negative nums
# drawback is [0, 7, 3, 9999999999999999999]

def countingSort(nums):
    _max = max(nums)
    counts = [0]*(_max+1)

    for i in nums:
        counts[i] += 1

    print(counts)
    for i in range(len(counts)-1):
        counts[i+1] = counts[i] + counts[i+1]

    sorted_nums = [0]*len(nums)

    for num in nums:
        position = counts[num]
        counts[num] = position - 1
        sorted_nums[counts[num]] = num

    return sorted_nums

inputs = [[1], [4,3,5,7,2], [-3,4,6 , -9, 9]]
for input in inputs:
    print(input, end = " : ")
    print(countingSort(input))