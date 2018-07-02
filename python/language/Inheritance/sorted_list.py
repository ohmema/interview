class SimpleList:
    def __init__(self, items):
        print("__init__: SimpleList")
        self._items = list(items)

    def add(self, item):
        print("SimpleList Add")
        self._items.append(item)

    def sort(self):
        self._items.sort()

    def __getitem__(self, index):
        return self._items[index]

    def __len__(self):
        return len(self._items)

    def __repr__(self):
        return "SimpleList({!r})".format(self._items)

class SortedList(SimpleList):
    def __init__(self, items=()):
        print("__init__: SortedList")
        print(type(items))
        super().__init__(items)
        self.sort()

    def add(self, item):
        print("SortList Add")
        super().add(item)
        self.sort()

    def __repr__(self):
        return "SortedList({!r})".format(list(self))


class IntList(SimpleList):
    def __init__(self, items=()):
        print("__init__: IntList")
        for x in items:
            self._validate(x)
        super().__init__(items)

    @staticmethod
    def _validate(x):
        if not isinstance(x, int):
            raise TypeError("IntList only support integer values.")

    def add(self, item):
        print("IntList Add")
        self._validate(item)
        super().add(item)

    def __repr__(self):
        return "IntList({!r})".format(list(self))

class SortedIntList(IntList, SortedList):
    def __prer__(self):
        return "SortedIntList({!r})".format(list(self))

a = [2,54,33,2,12,9, -2]
s = SimpleList(a)
print(s)

print("#"*50 + "SortedList" + "#"*50)
s = SortedList(a)
print(s)


print("#"*50 + "IntList" + "#"*50)
s = IntList(a)
print(s)


print("#"*50 + "SortedIntList" + "#"*50)
s = SortedIntList([3,2, 1])
s.add(-4)
#s.add("sas")
print(s)