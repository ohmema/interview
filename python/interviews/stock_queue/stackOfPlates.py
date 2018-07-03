class Stack:
    Capacity = 3
    def __init__(self):
        self.stacks=[]
        self.index = 0

    def push(self, item):
        if len(self.stacks) == 0:
            self.stacks.append([item])
            self.index += 1
            return

        if self.index % Stack.Capacity == 0 :
            self.stacks.append([item])
        else:
            self.stacks[-1].append(item)
        self.index += 1

    def pop(self):
        assert self.index != 0
        self.index -= 1

        s, i = divmod(self.index, Stack.Capacity)

        if i ==0:
            rv = self.stacks[s].pop()
            self.stacks.pop()
            return rv
        else:
            return self.stacks[s].pop()

    def popAt(self, at):
        if not 0 < at < self.index -1:
            return

        list = []
        for i in range(self.index -1, -1,-1):
            item = self.pop()
            if i == at :
                continue
            list.append(item)

        for i in range(len(list)-1, -1,-1):
            self.push(list[i])

s = Stack()
for i in range(10):
    s.push(i)


import pprint;
pprint.pprint(s.stacks)

s.popAt(2)
pprint.pprint(s.stacks)
#for i in range(10):
#    s.pop()
#    pprint.pprint(s.stacks)