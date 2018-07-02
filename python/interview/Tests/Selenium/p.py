"""
class Queue:
    def __init__(self, max):
        assert max > 0
        self.queue = [None] * max
        self.curr = -1

    def add(self, item):
        if self.curr >= len(self.queue):
            raise IndexError
        self.curr = self.curr + 1
        self.queue[self.curr] = item

    def remove(self):
        if self.curr < 0:
            raise IndexError
        rv = self.queue[0]
        for i in range(1, len(self.queue)):
            self.queue[i - 1] = self.queue[i]
        self.curr = self.curr - 1
        return rv

"""
class Queue:
    def __init__(self, max):
        assert max > 0
        self.queue = [None] * max
        self.i = 0
        self.j = 0
        self.empty = True
        self.full = False

    def add(self, item):

        if self.full:
            raise IndexError
        if self.i == self.j:
            self.empty = False

        next_j = (self.j + 1) % len(self.queue)
        if next_j == self.i:
            self.full = True
        self.queue[self.j] = item
        self.j = next_j

    def remove(self):
        if self.empty:
            raise IndexError
        if self.i == self.j:
            self.full = False
        rv = self.queue[self.i]
        self.queue[self.i] = None
        next_i = (self.i +1) % len(self.queue)
        if next_i == self.j:
            self.empty = True
        self.i = next_i
        return rv

# 1 remove
# add(1) * 10 + add(1)
# add(1) + remove()

q = Queue(10)
q.add(0)
print(q.queue)
q.add(1)
print(q.queue)
q.add(2)
print(q.queue)
q.remove()
print(q.queue)
q.remove()
print(q.queue)
q.remove()
print(q.queue)
q.add(0)
q.add(1)
q.add(2)
q.add(3)
q.add(4)
q.add(5)
q.add(6)
q.add(7)
q.add(8)
q.add(9)
#q.add(1)
#q.add(2)
print(q.remove())
print(q.remove())
print(q.remove())
q.remove()
q.remove()
q.remove()
q.remove()
q.remove()
q.remove()
q.remove()
q.add(9)
print(q.queue)