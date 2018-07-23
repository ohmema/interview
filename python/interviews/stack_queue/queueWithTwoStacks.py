class MyQueue(object):
    def __init__(self):
        self.input = []
        self.output = []

    def peek(self):
        if not len(self.output):
            self.output_mode()
        return self.output[-1]

    def output_mode(self):
        while len(self.input) != 0:
            self.output.append(self.input.pop())

    def pop(self):
        if not len(self.output):
            self.output_mode()
        re_v = self.output.pop()
        return re_v

    def put(self, value):
        self.input.append(value)

q = MyQueue()
q.put(42)
print(q.peek())
q.put(14)
print(q.peek())
q.put(28)
print(q.peek())
q.pop()
q.pop()
print(q.output)
print(q.input)
print(q.peek())