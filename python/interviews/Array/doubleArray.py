import pprint

grid = [[True]* 5 for _ in range(5)]
grid[0][0] = False
pprint.pprint(grid)

igrid = [[0]*10 for _ in range(10)]
igrid[0][0] = -1
pprint.pprint(igrid)
