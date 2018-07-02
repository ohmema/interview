import pprint

def makeGrid(m,n):
    grid = [ [1]*n for _ in range(m)]

    for i in range(min(m,n)):
        try:
            grid[i][i] = 0
            grid[i][i+1] = 0
        except:
            pass

    for i in range(min(n,m), len(grid)):
        grid[i][len(grid[0])-1]=0

    for i in range(min(n, m), len(grid[0])):
        grid[len(grid)-1][i]=0

    return grid

def printGrid(g):
    for l in g:
        print(l)

#printGrid(makeGrid(10,8))

def findPath(m,n):
    grid = makeGrid(m,n)
    printGrid(grid)
    trace = []
    rv =_findPath(grid, (0,0), (m-1,n-1), trace)
    #return rv if rv == [] else trace
    return rv

def _findPath(grid, src, dest, trace):
    i, j = src[0], src[1]
    #if grid[i][j] == 1:
    #    return []

    if not 0<= i < len(grid):
        return []

    if not 0 <= j < len(grid[0]):
        return []

    if grid[i][j] == 1:
        return []

    if dest[0] == i and dest[1] == j:
        return trace

    next = (i+1, j)
    if next not in trace:
        trace.append(next)
        rv = _findPath(grid, next, dest, trace)
        if rv ==[]:
            trace.remove(next)
        else:
            return rv

    next = (i - 1, j)
    if next not in trace:
        trace.append(next)
        rv = _findPath(grid, next, dest, trace)
        if rv == []:
            trace.remove(next)
        else:
            return rv

    next = (i, j+1)
    if next not in trace:
        trace.append(next)
        rv = _findPath(grid, next, dest, trace)
        if rv == []:
            trace.remove(next)
        else:
            return rv
    next = (i, j-1)
    if next not in trace:
        trace.append(next)
        rv = _findPath(grid, next, dest, trace)
        if rv == []:
            trace.remove(next)
        else:
            return rv
    return []

path = findPath(5,4)

print(path)