"""
Write a program or method that has the following:
Input: integer number
output: largest number one can create using the same digits from the input number

1844 -> 8441
#-983 -> -389


Input:  29105421178209486322754
Output: 99887765544432222211100
"""


def orderDigits(num):
    nums = []
    neg = False
    if num < 0:
        neg = True

    if neg:
        num = num * -1

    while num:
        num, mod = divmod(num, 10)
        nums.append(mod)

    if neg:
        nums.sort()
    else:
        nums.sort(reverse=True)

    re = 0
    for i in nums:
        re = re * 10 + i

    if neg:
        re = re * -1

    #return re
    return int("".join(map(str, nums)))

print(orderDigits(29105421178209486322754))