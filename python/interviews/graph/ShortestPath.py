from queue import Queue
'''
This is shortest path when its edges has same factor
'''

class Graph:
    def __init__(self, n):
        self.g = {}
        self.n = n
        for i in range(1, n + 1):
            nodes = self.g.get(i, set())
            self.g[i] = nodes

    def connect(self, s, e):
        self.g[s].add(e)
        self.g[e].add(s)

    def find_all(self, s):
        q = Queue()
        q.put(s)
        distance = [-1] * (self.n + 1)
        distance[s] = 0
        while not q.empty():
            node = q.get()
            for n in self.g[node]:
                if distance[n] == -1 and n != s:
                    q.put(n)
                    distance[n] = distance[node] + 6
        for i in range(1, self.n + 1):
            if s != i:
                print(distance[i], end=" ")
        print()



graph = Graph(4)
graph.connect(1,4)
graph.connect(1,3)
graph.connect(1,2)
#print(graph.g)
graph.find_all(1)


graph = Graph(3)
graph.connect(2,3)
#print(graph.g)
graph.find_all(2)


graph = Graph(70)
with open("input.txt", mode = "rt") as f:
    for line in f:
        a, b = line.strip().split()
        graph.connect(int(a), int(b))



print("#"*100)
graph.find_all(16)

print("#"*30 +  " ANSWER " + "#"*30)
with open("expected.txt", mode = "rt") as f:
    print("".join(f.readlines()))
print("#" * 100)
