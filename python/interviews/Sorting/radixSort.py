#RadixSort is only Numbers


def radixSort(nums):
    digits = getnumOfLoop(nums)
    buckets = [[] for _ in range(10)]

    for digit in range(digits):
        for num in nums:
            index = getBucket(num, digit)
            buckets[index].append(num)
        #import pprint
        #pprint.pprint(buckets)
        order = 0
        #print(nums)
        for i in range(10):
            while len(buckets[i]) != 0:
                num = buckets[i].pop(0)
                nums[order] = num
                order += 1
        #print(nums)



def getBucket(num, digit):
    mod = num
    for i in range(digit+1):
        num, mod = divmod(num, 10)
    return mod

def getnumOfLoop(nums):
    max_num = max(nums)
    N_digits = 0
    while max_num !=0:
        max_num //= 10
        N_digits += 1
    return N_digits

inputs = [[2,3,44,556,665], [4,8, 2, 55, 32, 11], [-3, -3, -4, -4, -34]]
inputs = [ [-3, -3, -4, -4, -34]]
for input in inputs:
    print(input, end= " : ")
    radixSort(input)
    print(input)