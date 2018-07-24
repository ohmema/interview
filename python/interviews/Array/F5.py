def threeSum(nums):
    """
    :type nums: List[int]
    :rtype: List[List[int]]
    """
    sub = []
    for i, e1 in enumerate(nums):
        for j, e2 in enumerate(nums):
            for k, e3 in enumerate(nums):
                if i != j and j!= k and i != k and e1+e2+e3 == 0:
                    can = sorted([i,j,k])
                    if can not in sub:
                        sub.append(can)
    results = []
    for l in sub:
        a = sorted([nums[l[0]],nums[l[1]], nums[l[2]]])
        if a not in results:
            results.append(a)
    return results

input=[-1,0,1,2,-1,-4]
print(threeSum(input))