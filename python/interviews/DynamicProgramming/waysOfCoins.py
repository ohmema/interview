def ways_expensive(n, coins):
    return _ways_expensive(n, coins, 0)


def _ways_expensive(n, coins, index):
    if n == 0:
        return 1
    if n < 0:
        return 0
    if index >= len(coins):
        return 0

    ways = 0
    coinsmount = 0
    while coinsmount <= n:
        remaining = n - coinsmount;
        ways += _ways_expensive(remaining, coins, index +1)
        coinsmount += coins[index]
    return ways


def makeChange_recursion(n, coins):
    return _ways(n, coins, 0, {})


def _ways(n, coins, index, memo):
    if n == 0:
        return 1
    if n < 0:
        return 0
    if index >= len(coins):
        return 0

    ways = 0
    coinsmount = 0

    key = str(n) + "-"+ str(index)
    if key in memo:
        return memo[key]

    while coinsmount <= n:
        remaining = n - coinsmount;
        ways += _ways_expensive(remaining, coins, index +1)
        coinsmount += coins[index]

    memo[key] = ways
    return memo[key]

def make_change(n, coins):
    results = [0 for _ in range(n + 1)]
    results[0] = 1
    for coin in coins:
        for i in range(coin, n + 1):
            results[i] += results[i - coin]
    return results[n]

inputs= [(928, [25,10,5, 1])]

for input in inputs:
    print(" {} : {}".format (input[0], input[1]), end = " : ")
    import time
    t1 = time.time()
    print(ways_expensive(input[0], input[1]), end=" : ")
    t2 = time.time()
    print(t2- t1, end = " : ")
    print(makeChange_recursion(input[0], input[1]), end=" : ")
    t3 = time.time()
    print(t3- t2, end = " : ")
    print(make_change(input[0], input[1]), end = " : ")
    t4 = time.time()
    print(t4- t3)