import random

class MineGame:
    def __init__(self, m=10, n=10, k=3):
        # i = 0 initail value
        # number will be calculated by nabohors of minds
        self.grid = [[0] * m for i in range(n)]
        self.mindset = set()

        # k should be less tha all of m*n elements
        while len(self.mindset) != k:
            i = random.randint(0, m-1)
            j = random.randint(0, n-1)
            self.mindset.add((i, j))

        self.generateNumbers()

    def generateNumbers(self):
        visited = set()
        # This is O(n) because of jump before look
        self._generate(0, 0, visited)

    def _generate(self, i, j, visited):
        if i == len(self.grid) and j == len(self.grid[0]):
            return
        if not 0 <= i < len(self.grid):
            return
        if not 0 <= j < len(self.grid[0]):
            return

        # (i -1, j),  (i-1, j-1), (i -1, j+1)
        # (i+1, j ), (i+1, j+1), (i+1, j-1)
        # (i, j+1), (i , j-1)
        countMine = 0
        nabos = [
            (i - 1, j), (i - 1, j - 1), (i - 1, j + 1), (i + 1, j), (i + 1, j + 1), (i + 1, j - 1), (i, j + 1), (
            i, j - 1)]
        for _nabo in nabos:
            if not 0 <= _nabo[0] < len(self.grid):
                continue
            if not 0 <= _nabo[1] < len(self.grid[0]):
                continue
            if _nabo in self.mindset:
                countMine += 1

        self.grid[i][j] = countMine
        visited.add((i, j))

        for _nabo in nabos:
            if _nabo not in visited and _nabo not in self.mindset:  # no need to calculate for mindset i,j
                self._generate( _nabo[0], _nabo[1], visited)

    def printGrid(self):
        for i in range(len(self.grid)):
            print(self.grid[i])

g = MineGame()
print(g.mindset)
print(g.printGrid())