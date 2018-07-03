def makeGrid(m,n):
    grid = [ [1]*n for _ in range(m)]

    for i in range(min(m,n)):
        try:
            grid[i][i] = 0
            grid[i][i+1] = 0
        except IndexError:
            pass

    for i in range(min(n,m), len(grid)):
        grid[i][len(grid[0])-1]=0

    for i in range(min(n, m), len(grid[0])):
        grid[len(grid)-1][i]=0

    return grid

def printGrid(g):
    for l in g:
        print(l)

def paintFill(grid, color, new_color, i, j):
    if not 0<= i < len(grid):
        return
    if not 0 <= j <len(grid[0]):
        return

    if grid[i][j] != color:
        return

    grid[i][j] = new_color

    paintFill(grid, color, new_color, i + 1, j)
    paintFill(grid, color, new_color, i - 1, j)
    paintFill(grid, color, new_color, i, j+1)
    paintFill(grid, color, new_color, i , j -1)

grid = makeGrid(5,6)
printGrid(grid)
print()
paintFill(grid,1, 3, 4,2)
printGrid(grid)