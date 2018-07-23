# Enter your code here. Read input from STDIN. Print output to STDOUT
"""
write a function that takes in 2 lists and adds them up elementwise starting from last to first element. Resultant list should only have single digits.

[5 6 7] [ 5 7 3] = [1,1,4,0]

"""


def add_list(nums1, nums2):
    results = []
    carrier = 0

    min_length = min(len(nums1), len(nums2))
    max_length = max(len(nums1), len(nums2))
    max_list = nums1 if max_length == len(nums1) else nums2
    min_list = nums2 if min_length == len(nums1) else nums2
    diff = max_length - min_length

    for _ in range(diff):
        min_list.insert(0, 0)

    for i in range(max_length -1 , -1, -1):
        _sum = max_list[i] + min_list[i] + carrier
        carrier, num = divmod(_sum, 10)
        results.insert(0, num)

    if carrier == 1:
        results.insert(0, 1)

    return results


inputs = [([5, 6, 7], [5, 7, 3]), ([9, 9, 9, 9, 9], [9, 9, 9])]

for input in inputs:
    print(add_list(input[0], input[1]))

