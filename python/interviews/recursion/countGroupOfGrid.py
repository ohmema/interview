"""
Consider a matrix where each cell contains either a  or a  and any cell containing a  is called a filled cell.
Two cells are said to be connected if they are adjacent to each other horizontally, vertically, or diagonally.
In the diagram below, the two colored regions show cells connected to the filled cells. Black on white are not connected.

1 1 0 0
0 1 1 0
0 0 1 0
1 0 0 1


6

"""

def maxRegion(grid):
    visited = set()
    max_num = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if (i, j) not in visited:
                n = _max_region(grid, visited, i, j)
                max_num = max(n, max_num)
    return max_num


def _max_region(grid, visited, i, j):
    if not (0 <= i < len(grid)) or not (0 <= j < len(grid[0])) or grid[i][j] == 0:
        return 0

    visited.add((i, j))

    # If ommly four directions wre connewcted, then [(i, j + 1), (i, j - 1), (i + 1, j), (i - 1, j)]
    directions = [(i, j + 1), (i, j - 1), (i + 1, j), (i - 1, j), (i + 1, j + 1), (i + 1, j - 1), (i - 1, j + 1),
                  (i - 1, j - 1)]
    num = 1
    for d in directions:
        if d not in visited:
            num += _max_region(grid, visited, d[0], d[1])
    return num