"""
You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

Example 1:

Input: coins = [1, 2, 5], amount = 11
Output: 3
Explanation: 11 = 5 + 5 + 1
Example 2:

Input: coins = [2], amount = 3
Output: -1
Note:
You may assume that you have an infinite number of each kind of coin.
"""
def coinChange(coins, amount):

    memo = [-1] * (amount + 1)
    memo[0] = 0
    for coin in coins:
        if coin <= amount:
            memo[coin] = 1

    return _coinChange(coins, amount, memo)


def _coinChange(coins, amount, memo):
    if amount < 0:
        return -1
    if memo[amount] != -1:
        return memo[amount]
    for coin in coins:
        _min = _coinChange(coins, amount - coin, memo)
        if _min != -1 and memo[amount] != -1:
            memo[amount] = min(memo[amount], _min)
        if _min != -1 and memo[amount] == -1:
            memo[amount] = _min
    memo[amount] += 1
    return _min


inputs = [([1,2,5], 11)]

for i in inputs:
    print(coinChange(i[0], i[1]))