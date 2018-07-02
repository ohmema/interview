class ExampleIterator:
    def __init__(self, sequence):
        self.index = 0
        self.data=sorted(sequence, reverse=True)
    def __iter__(self):
        self.index = 0
        return self
    def __next__(self):
        if self.index >= len(self.data):
            raise StopIteration()

        result = self.data[self.index]
        self.index += 1
        return result

class ExampleIterable:
    def __init__(self):
        self.data = [1,2,3]

    def __iter__(self):
        return ExampleIterator(self.data)

for i in ExampleIterator([1,2,3]):
    print(i)

for i in ExampleIterable():
    print(i)
"""
The Alterative iterable protocaol works with any object that supports consecutive integer indexing via __getitem__()
"""

class AlternativeIterable:
    def __init__(self):
        self.data =[5,6,7]

    def __getitem__(self, index):
        return self.data[index]

for i in AlternativeIterable():
    print(i)

print()
l = [1,2,3,4,5,6,7]
myiter = iter(l)

for i in myiter:
    print(i)



import datetime
t = iter(datetime.datetime.now, None)

j = 0
for i in t:
    print(i)
    if j == 10:
        break
    j +=1

def p():
    return 1

j = 0
for i in iter(p, None):
    print(i)
    if j == 10:
        break
    j +=1