def uniquePaths( m, n):

    memo = [[0] * m for _ in range(n)]
    memo[0][0] = 1
    for i in range(len(memo)):
        for j in range(len(memo[0])):
            if i - 1 >= 0:
                memo[i][j] += memo[i - 1][j]
            if j - 1 >= 0:
                memo[i][j] += memo[i][j - 1]

    return memo[n - 1][m - 1]

inputs = [(4, 3),(3,2), (2,3)]

for i in inputs:
    print(uniquePaths(i[0], i[1]))