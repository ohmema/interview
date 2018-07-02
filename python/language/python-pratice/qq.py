def ssl():
    if True:
        for i in range(10):
            if i == 7:
                v = i
        ss = "aaa"
        print(ss)
        print(v)

    print(ss)

#ssl()

"""
t = [(3,"sss"), (1,"saa"), (-3, "4444")]

print(sorted(t, key = lambda x: x[0]))

t.sort(key = lambda x: x[0])
print([x[1] for x in t])
"""

def noduplicates(nums):
    result = []
    i = 0
    while i < len(nums):
        j = i+1
        result.append(nums[i])
        while j < len(nums) and nums[i] == nums[j]:
            j = j+1
        i = j
    return result
nums =[2,3,4,4,5,5,6,6,6]

print(noduplicates(nums))
