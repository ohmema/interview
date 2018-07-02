"""
Super() measns the mro (method resolution order)
"""

class SimpleList:
    def __init__(self, items):
        self._items = list(items)

    def add(self, item):
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
        super().__init__(items)
        self.sort()

    def add(self, item):
        super().add(item)

    @staticmethod
    def smethod():
        return "SortedList static method"


    def __repr__(self):
        return "SortedList({!r})".format(list(self))


class IntList(SimpleList):
    def __init__(self, items=()):
        for x in items: self._validate(x)
        super().__init__(items)

    @staticmethod
    def _validate(x):
        if not isinstance(x, int):
            raise TypeError

    def add(self, item):
        self._validate(x)
        super().add(item)

    def __repr__(self):
        return "IntList({!r})".format(list(self))

class SortedIntList(IntList, SortedList):
    def __repr__(self):
        return "SortedIntList({!r})".format(list(self))


sil = SortedIntList([5, 4, -5,6])

# print(sil)
#
# print(SortedIntList.mro())
#
# print(super(SortedList, SortedIntList).add)
"""
Method can be found after SortedIntlist.
So this is an error:  super(IntList, SortedIntList)._validate(5)
"""
#print(super(SortedIntList, SortedIntList)._validate(5))
#print(super(SortedIntList, SortedIntList)._validate("ss"))
print(super(IntList, SortedIntList).smethod())

print(super(SortedList, SortedIntList))

#it appies only SimpleList
print(super(SortedList, sil))

super(SortedList, sil).add(-4)
print(sil)

super(SortedList, sil).add("asasa")
print(sil)