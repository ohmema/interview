def vol(*nums):
    print(len(nums))
    s = 1
    for i in nums:
        s *= i
    return s

print(vol(1, 2, 3,4,5))

print(vol())