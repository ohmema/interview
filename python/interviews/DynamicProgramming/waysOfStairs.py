

def ways_stairs(stairs, steps):
    if stairs == 0:
        return 1
    if stairs < 0:
        return 0
    ways = 0
    for step in steps:
        ways += ways_stairs(stairs - step, steps)
    return ways

def ways_stairs_dp(stairs, steps):
    memo = [0]*(stairs +1)
    memo[0] = 1

    for i in range(1, stairs +1 ):
        for step in steps:
            if i - step >=0:
                memo[i] += memo[i - step]
    return memo[stairs]

inputs= [(5, [1,2,3]),(30, [1,2,3])]

for input in inputs:
    print(" {} : {}".format(input[0], input[1]), end = " : ")
    import time
    t1 = time.time()
    print(ways_stairs(input[0], input[1]), end=" : ")
    t2 = time.time()
    print(t2 - t1, end=" : ")

    t1 = time.time()
    print(ways_stairs_dp(input[0], input[1]), end=" : ")
    t2 = time.time()
    print(t2 - t1, end=" : ")
    print()