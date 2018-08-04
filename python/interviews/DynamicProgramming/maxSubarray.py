def maxSubArray(nums):

    n = len(nums)
    memo = [0] * n
    memo[0] = nums[0]
    submax = nums[0]
    for i in range(1, n):
        t_max = max(memo[i - 1] + nums[i], nums[i])
        if t_max > submax:
            submax = t_max
            memo[i] = submax
        else:
            if t_max < 0:
                memo[i] = 0
            else:
                memo[i] = t_max
    return submax

inputs =  [[1, 0 ,3, 0, 4], [-1,-2,-3,-4,-5], [-2,1,-3,4,-1,2,1,-5,4]]
for i in inputs:
    print(i, end = " : ")
    print(maxSubArray(i))