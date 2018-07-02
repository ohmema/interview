class SimpleList:
    def __init__(self, items):
        self._items = list(items)

    def add(self, item):
        self._items.append(item)

    def __getitem__(self, idx):
        return self._items[idx]

    def sort(self):
        self._items.sort()

    def __len__(self):
        return len(self._items)

    def __repr__(self):
        return "SimpleList ({!r})".format(self._items)

class SortedList(SimpleList):
    def __init__(self, items = ()):
        super().__init__(items)
        self.sort()

    def add(self, item):
        super().add(item)
        self.sort()

    def __repr__(self):
        return "SortedList ({!r})".format(self._items)

class IntList(SimpleList):
    def __init__(self, items=()):
        for x in items: self._validate(x)
        super().__init__(items)

    @staticmethod
    def _validate(x):
        assert isinstance(x, int)

    def add(self, item):
        self._validate(item)
        super().add(item)

    def __repr__(self):
        return "IntList ({!r})".format(self._items)

class SortedIntList(IntList, SortedList):
    def __repr__(self):
        return "SortedIntList ({!r})".format(self._items)

s = SortedIntList([1,22,3, 55])
print(str(s))
#s = SortedIntList([1,22,3, 55.2])
#print(str(s))

s.add(-22)
print(str(s))

# s.add(-22.2)
# print(str(s))

print(SortedIntList.__bases__)
print("*"*100)
print(SortedIntList.__mro__)
print(SortedIntList.mro())

print("*"*100)
a = super(SortedList, SortedIntList)
print(a)
