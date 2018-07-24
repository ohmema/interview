import pprint

def findpath(grid):
    memo = [[0]*len(grid[0]) for _ in range(len(grid))]
    _findpath(grid, 0,0, memo)
    pprint.pprint(memo)
    return memo[0][0]

def _findpath(grid, i, j, memo):
    if i == len(grid) -1 and j == len(grid[0])-1:
        return 1

    if not isValid(grid, i, j):
        return 0

    if memo[i][j] == 0:
        right = _findpath(grid, i, j+1, memo)
        down = _findpath(grid, i+1, j, memo)
        memo[i][j] = right + down
    return memo[i][j]

def isValid(grid, i, j):
    if not  (0 <= i < len(grid) and 0 <= j < len(grid[0]) ):
        return False

    if grid[i][j] == False:
        return False

    return True

grid = [[True]* 10 for _ in range(10)]
for i in range(7):
    grid[5][i] = False



pprint.pprint(grid)
print(findpath(grid))


