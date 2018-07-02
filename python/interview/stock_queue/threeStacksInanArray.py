


class Stacks:
    def __init__(self, n):
        if n < 3:
            raise ValueError("n shouold be larger than 3")
        self.n = n
        self.s1, self.p1 = 0, 0
        self.s2, self.p2 = n//3, n//3
        self.s3, self.p3 = 2*n//3, 2*n//3
        self.stack = [0]*n

    def push_s1(self, n):
        if self.p1 < self.s2:
            self.stack[self.p1] = n
            self.p1 += 1
        else:
            raise IndexError("stack full")

    def pop_s1(self):
        assert self.p1 - 1 >= 0
        self.p1 -= 1
        return self.stack[self.p1]

    def push_s2(self, n):
        if self.p2 < self.s3:
            self.stack[self.p2] = n
            self.p2 += 1
        else:
            raise IndexError("stack full")

    def pop_s2(self):
        assert self.p2 -1 >= self.s2
        self.p2 -= 1
        return self.stack[self.p2]

    def push_s3(self, n):
        if self.p1 < self.n:
            self.stack[self.p3] = n
            self.p3 += 1
        else:
            raise IndexError("stack full")

    def pop_s3(self):
        assert self.p3 -1 >= self.s3
        self.p3 -= 1
        return self.stack[self.p3]

s = Stacks(4)

s.push_s1(10)
s.push_s2(9)
s.push_s3(4)
s.push_s3(3)
print(s.pop_s1())
print(s.pop_s2())
print(s.pop_s3())
print(s.pop_s3())