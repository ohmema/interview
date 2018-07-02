"""
Suppose n people are sitting in a circular table with names A, B, C, D,…. Given a name, we need to print all n people (in order) starting from given name.
"""

def makeArray(m):
    num = ord('A')
    array = []
    for i in range(m):
        array.append(chr(num+i))
    return array

def printAllFromStarting(array, k):
    i = 0
    for _ in range(k):
        i += 1
    for k in range(i, i+len(array)):
        print(array[k%len(array)], end="")
    print()

def printAllFromGivenName(array, name):
    i = 0

    if array.count(name) == 0:
        raise ValueError

    while name != array[i]:
        i += 1

    for k in range(i, i + len(array)):
        print(array[k%len(array)], end="")
    print()

a = makeArray(5)

printAllFromStarting(a, 3)
printAllFromGivenName(a, "B")